package com.example.fcon;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class fcoProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fco_profile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView ho = findViewById(R.id.home);
        ImageView no = findViewById(R.id.notificationBtn);
        ImageView mes = findViewById(R.id.message);

        ho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ho = new Intent(fcoProfile.this, fco_officer_homepage.class);
                startActivity(ho);
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent no = new Intent(fcoProfile.this, fcoNotification.class);
                startActivity(no);
            }
        });

        mes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mes = new Intent(fcoProfile.this, fcoMessage.class);
                startActivity(mes);
            }
        });
    }
}