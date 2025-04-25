package com.example.fcon;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class fco_officer_homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fco_officer_homepage);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        FloatingActionButton back = findViewById(R.id.BackToStudentHome);
        Button fb = findViewById(R.id.btnFeedback);
        Button announce = findViewById(R.id.btnAnnounce);
        Button add = findViewById(R.id.btnAddEvent);
        ImageView Notification = findViewById(R.id.notificationBtn);
        ImageView pro = findViewById(R.id.profile);
        ImageView mes = findViewById(R.id.message);
        Button att = findViewById(R.id.btnViewAttendanceAndFines);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(fco_officer_homepage.this, fco_homepage.class);
                startActivity(back);
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fb = new Intent(fco_officer_homepage.this, feedback.class);
                startActivity(fb);
            }
        });

        announce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent an = new Intent(fco_officer_homepage.this, com.example.fcon.announce.class);
                startActivity(an);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add = new Intent(fco_officer_homepage.this, addEvent.class);
                startActivity(add);
            }
        });

        Notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(fco_officer_homepage.this, fcoNotification.class);
                startActivity(n);
            }
        });

        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pro = new Intent(fco_officer_homepage.this, fcoProfile.class);
                startActivity(pro);
            }
        });

        mes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mes = new Intent(fco_officer_homepage.this, fcoMessage.class);
                startActivity(mes);
            }
        });

        att.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent att = new Intent(fco_officer_homepage.this, attendance_fines.class);
                startActivity(att);
            }
        });

    }
}