package avastudio.example.newstime;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import avastudio.example.newstime.api.ApiGeo;

public class SplashScreen extends AppCompatActivity {

    private String geo = "";
    private String weather = "error";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        if (hasConnection(SplashScreen.this)) {
            AsyncApiIpChecker asyncApiIpChecker = new AsyncApiIpChecker();
            asyncApiIpChecker.execute();
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    SplashScreen.this.startActivity(new Intent(SplashScreen.this, InternetOffActivity.class));
                    SplashScreen.this.finish();
                }
            }, 2000);

        }
    }

    public static boolean hasConnection(final Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifiInfo = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (wifiInfo != null && wifiInfo.isConnected()) {
            return true;
        }
        wifiInfo = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        if (wifiInfo != null && wifiInfo.isConnected()) {
            return true;
        }
        wifiInfo = cm.getActiveNetworkInfo();
        if (wifiInfo != null && wifiInfo.isConnected()) {
            return true;
        }
        return false;
    }

    private class AsyncApiIpChecker extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... strings) {
            String urlIpString = "http://checkip.dyndns.org/";
            String urlGeoPosition = "https://ipwhois.app/json/";
            String myip = "";
            String geoJson = "";
            try {
                URL urlIP = new URL(urlIpString);
                HttpURLConnection HttpIp = (HttpURLConnection) urlIP.openConnection();
                InputStream inputHttpIp = HttpIp.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputHttpIp));
                myip = reader.readLine();
                myip = myip.substring(myip.indexOf("Current IP Address:") + 20);
                myip = myip.substring(0, myip.indexOf("</body>"));
                urlGeoPosition.concat(myip);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                URL urlIP = new URL(urlGeoPosition);
                HttpURLConnection HttpGeo = (HttpURLConnection) urlIP.openConnection();
                InputStream inputHttpGeo = HttpGeo.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputHttpGeo));
                geoJson = reader.readLine();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return geoJson;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            geo = s;
            AsyncWeatherChecker asyncWeatherChecker = new AsyncWeatherChecker();
            asyncWeatherChecker.execute();
        }
    }

    private class AsyncWeatherChecker extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... strings) {
            String urlWeatherString = "http://api.openweathermap.org/data/2.5/weather?";
            ApiGeo apiGeo = new Gson().fromJson(geo, ApiGeo.class);
            urlWeatherString = urlWeatherString.concat("lat=").concat(apiGeo.getLatitude()).concat("&lon=").concat(apiGeo.getLongitude()).concat("&appid=").concat(getBaseContext().getString(R.string.weatherApi));
            try {
                URL urlIP = new URL(urlWeatherString);
                HttpURLConnection HttpIp = (HttpURLConnection) urlIP.openConnection();
                InputStream inputHttpIp = HttpIp.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputHttpIp));
                return reader.readLine();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "error";
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            weather = s;
            Intent intent = new Intent(SplashScreen.this, MainActivity.class);
            intent.putExtra("geoPosition", geo);
            intent.putExtra("weather", weather);
            SplashScreen.this.startActivity(intent);
            SplashScreen.this.finish();
        }
    }

}
