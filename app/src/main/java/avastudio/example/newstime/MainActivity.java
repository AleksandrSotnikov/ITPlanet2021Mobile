package avastudio.example.newstime;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import java.util.ArrayList;

import avastudio.example.newstime.api.ApiGeo;
import avastudio.example.newstime.api.ApiWeather;

public class MainActivity extends AppCompatActivity {

    private static TextView tvCourse;
    private static TextView tvTemp;
    private static TextView tvClouds;
    private static TextView tvWind;
    private static TextView tvPressure;
    private static TextView tvHumidity;
    private static ListView listView;
    private static ArrayList<String> arraySite;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        arraySite = new ArrayList<String>();
        listView = findViewById(R.id.listView);
        siteAdd();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, arraySite);
        listView.setAdapter(adapter);

        Intent intent = getIntent();
        ApiGeo apiGeo = new Gson().fromJson(intent.getStringExtra("geoPosition"), ApiGeo.class);
        ApiWeather apiWeather = new Gson().fromJson(intent.getStringExtra("weather"), ApiWeather.class);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                Intent intents = new Intent(MainActivity.this, WebActivity.class);
                intents.putExtra("url", ((TextView) itemClicked).getText());
                intents.putExtra("geoPosition", intent.getStringExtra("geoPosition"));
                MainActivity.this.startActivity(intents);
                MainActivity.this.finish();
            }
        });
        ImageView image = findViewById(R.id.ivWeather);
        switch (apiWeather.getWeather().get(0).getDescription()) {
            case "clear sky":
                image.setImageDrawable(this.getResources().getDrawable(R.drawable.sun));
                break;
            case "few clouds":
                image.setImageDrawable(this.getResources().getDrawable(R.drawable.cloudy_3));
                break;
            case "scattered clouds":
                image.setImageDrawable(this.getResources().getDrawable(R.drawable.cloudy));
                break;
            case "broken clouds":
                image.setImageDrawable(this.getResources().getDrawable(R.drawable.rain0));
                break;
            case "shower rain":
                image.setImageDrawable(this.getResources().getDrawable(R.drawable.rain1));
                break;
            case "rain":
                image.setImageDrawable(this.getResources().getDrawable(R.drawable.rain3));
                break;
            case "thunderstorm":
                image.setImageDrawable(this.getResources().getDrawable(R.drawable.storm));
                break;
            case "snow":
                image.setImageDrawable(this.getResources().getDrawable(R.drawable.snow));
                break;
            case "mist":
                image.setImageDrawable(this.getResources().getDrawable(R.drawable.fog));
                break;
        }
        tvTemp = findViewById(R.id.tvTemp);
        String temp = String.valueOf(apiWeather.getMain().getTemp() - 273.15d);
        tvTemp.setText("Температура: ".concat(temp.substring(0, temp.indexOf(".") + 2)).concat("°С"));
        tvClouds = findViewById(R.id.tvClouds);
        tvClouds.setText("Облачность: ".concat(String.valueOf(apiWeather.getClouds().getAll())).concat("%"));
        tvWind = findViewById(R.id.tvWind);
        tvWind.setText("Скорость ветра: ".concat(apiWeather.getWind().getSpeed().toString()).concat("м/c"));
        tvPressure = findViewById(R.id.tvPressure);
        tvPressure.setText("Давление: ".concat(apiWeather.getMain().getPressure().toString()).concat("гПА"));
        tvHumidity = findViewById(R.id.tvHumidity);
        tvHumidity.setText("Влажность: ".concat(apiWeather.getMain().getHumidity().toString()).concat("%"));
        tvCourse = findViewById(R.id.tvCourse);
        tvCourse.append(apiGeo.getCity());

    }

    private static void siteAdd() {
        arraySite.add("ria.ru");
        arraySite.add("lenta.ru");
        arraySite.add("yandex.ru/news");
        arraySite.add("iz.ru/news");
        arraySite.add("www.vesti.ru");
        arraySite.add("tass.ru");
        arraySite.add("life.ru");
        arraySite.add("www.newsru.com");
    }


}