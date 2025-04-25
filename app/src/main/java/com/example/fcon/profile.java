package com.example.fcon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView hom = findViewById(R.id.home);
        ImageView no = findViewById(R.id.notif);
        ImageView att = findViewById(R.id.attendance);
        Button log = findViewById(R.id.logout_button);
        ImageView mess = findViewById(R.id.message);

        hom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ho = new Intent(profile.this, homepage.class);
                startActivity(ho);
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent no = new Intent(profile.this, notification.class);
                startActivity(no);
            }
        });

        att.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent att = new Intent(profile.this, attendance.class);
                startActivity(att);
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent log = new Intent(profile.this, MainActivity.class);
                startActivity(log);
            }
        });

        mess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mess = new Intent(profile.this, message.class);
                startActivity(mess);
            }
        });

        hom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h = new Intent(profile.this, fco_homepage.class);
                startActivity(h);
            }
        });
    }
}