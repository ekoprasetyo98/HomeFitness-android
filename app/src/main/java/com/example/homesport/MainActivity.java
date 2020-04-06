package com.example.homesport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button mulai, wa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mulai = findViewById(R.id.btn1);
        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hal1 = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(hal1);
            }
        });

        wa = findViewById(R.id.btn2);
        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri url = Uri.parse("https://api.whatsapp.com/send?phone=6289630592265");
                Intent whatsapp = new Intent(Intent.ACTION_VIEW, url);
                startActivity(whatsapp);
            }
        });
    }
}
