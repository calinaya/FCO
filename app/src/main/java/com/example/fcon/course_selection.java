package com.example.fcon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class course_selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_course_selection);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        LinearLayout it = findViewById(R.id.bsitCard);
        LinearLayout cs = findViewById(R.id.bscsCard);
        LinearLayout act = findViewById(R.id.actCard);
        LinearLayout emc = findViewById(R.id.emcCard);
        ImageView back = findViewById(R.id.backButton);


        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(course_selection.this, year_level.class);
                startActivity(it);
            }
        });

        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cs = new Intent(course_selection.this, year_level.class);
                startActivity(cs);
            }
        });

        act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act = new Intent(course_selection.this, year_level.class);
                startActivity(act);
            }
        });

        emc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emc = new Intent(course_selection.this, year_level.class);
                startActivity(emc);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(course_selection.this, attendance_fines.class);
                startActivity(back);
            }
        });
    }
}