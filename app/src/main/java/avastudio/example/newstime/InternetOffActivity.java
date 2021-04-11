package avastudio.example.newstime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class InternetOffActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.internetoff);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Toast.makeText(this,"Отсутствует подключение к интернету, повторите попытку входа",Toast.LENGTH_LONG).show();
    }

    public void onClickRefresh(View view){
        InternetOffActivity.this.startActivity(new Intent(InternetOffActivity.this, SplashScreen.class));
        InternetOffActivity.this.finish();
    }
}