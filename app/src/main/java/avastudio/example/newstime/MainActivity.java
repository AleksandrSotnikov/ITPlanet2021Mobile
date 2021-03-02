package avastudio.example.newstime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import fr.arnaudguyon.xmltojsonlib.XmlToJson;

public class MainActivity extends AppCompatActivity {

    private static TextView tvCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCourse = findViewById(R.id.tvCourse);
       // String xmlString = "dsds";  // some XML String previously created
       // XmlToJson xmlToJson = new XmlToJson.Builder(xmlString).build();
    }
}