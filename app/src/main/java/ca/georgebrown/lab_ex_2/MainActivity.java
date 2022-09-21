package ca.georgebrown.lab_ex_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button openSecondActivityBtn, openWebBtn, openMapBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        openSecondActivityBtn = findViewById(R.id.second_activity_btn);
        openWebBtn = findViewById(R.id.web_activity_btn);
        openMapBtn = findViewById(R.id.map_activity_btn);

        openSecondActivityBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
            }
        });

        openWebBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://georgebrown.ca"));
                startActivity(intent);

            }
        });

        openMapBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:43.6762839,-79.4133207,17" + Uri.encode("160 Kendal Ave, Toronto")));
                startActivity(intent);
            }
        });
    }



}