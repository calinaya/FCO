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

public class year_level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_year_level);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView back = findViewById(R.id.backButton);
        LinearLayout y1 = findViewById(R.id.year1);
        LinearLayout y2 = findViewById(R.id.year2);
        LinearLayout y3 = findViewById(R.id.year3);
        LinearLayout y4 = findViewById(R.id.year4);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(year_level.this, course_selection.class);
                startActivity(back);
            }
        });

        y1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y1 = new Intent(year_level.this, student_attendance1.class);
                startActivity(y1);
            }
        });

        y2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y2 = new Intent(year_level.this, student_attendance1.class);
                startActivity(y2);
            }
        });

        y3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y3 = new Intent(year_level.this, student_attendance1.class);
                startActivity(y3);
            }
        });

        y4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y4 = new Intent(year_level.this, student_attendance1.class);
                startActivity(y4);
            }
        });
    }
}