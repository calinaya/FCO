package com.example.fcon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class notification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_notification);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView ho = findViewById(R.id.home);
        ImageView pro = findViewById(R.id.profile);
        ImageView att = findViewById(R.id.attendance);
        ImageView mess = findViewById(R.id.message);

        ho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hom = new Intent(notification.this, homepage.class);
                startActivity(hom);
            }
        });

        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pro = new Intent(notification.this, profile.class);
                startActivity(pro);
            }
        });

        att.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent att = new Intent(notification.this, attendance.class);
                startActivity(att);
            }
        });

        mess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mess = new Intent(notification.this, message.class);
                startActivity(mess);
            }
        });

        ho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h = new Intent(notification.this, fco_homepage.class);
                startActivity(h);
            }
        });
    }
}