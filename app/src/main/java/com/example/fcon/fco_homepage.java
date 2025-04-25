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

public class fco_homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fco_homepage);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView notif = findViewById(R.id.notif);
        ImageView pro = findViewById(R.id.profile);
        ImageView att = findViewById(R.id.attendance);
        ImageView qr = findViewById(R.id.qrCode);
        Button pros = findViewById(R.id.btnProspectus);
        Button req = findViewById(R.id.btnRequests);
        ImageView ev = findViewById(R.id.eventPoster1);
        Button cle = findViewById(R.id.btnClearance);
        ImageView mes = findViewById(R.id.message);
        Button fco = findViewById(R.id.btnFCOHome);

        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fco_homepage.this, notification.class);
                startActivity(intent);
            }
        });

        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prof = new Intent(fco_homepage.this, profile.class);
                startActivity(prof);
            }
        });

        att.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent att = new Intent(fco_homepage.this, attendance.class);
                startActivity(att);
            }
        });

        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent qr = new Intent(fco_homepage.this, qr_code.class);
                startActivity(qr);
            }
        });

        pros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pros = new Intent(fco_homepage.this, prospectus.class);
                startActivity(pros);
            }
        });

        req.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent req = new Intent(fco_homepage.this, concern_and_request.class);
                startActivity(req);
            }
        });

        ev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ev = new Intent(fco_homepage.this, event_details.class);
                startActivity(ev);
            }
        });

        cle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clear = new Intent(fco_homepage.this, clearance.class);
                startActivity(clear);
            }
        });

        mes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mes = new Intent(fco_homepage.this, message.class);
                startActivity(mes);
            }
        });

        fco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fco = new Intent(fco_homepage.this, fco_officer_homepage.class);
                startActivity(fco);
            }
        });

    }
}