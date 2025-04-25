package com.example.fcon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {

    EditText user, pass;
    Button log;
    CheckBox showPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        // Initialize views
        user = findViewById(R.id.etUsername);
        pass = findViewById(R.id.etPassword);
        log = findViewById(R.id.btnLogin);
        showPassword = findViewById(R.id.cbShowPassword);
        TextView forgot = findViewById(R.id.forgotPassword);

        // Login button click listener
        log.setOnClickListener(v -> {
            String username = user.getText().toString().trim();
            String password = pass.getText().toString().trim();

            // Default student credentials
            String studentUsername = "student";
            String studentPassword = "12345";

            // Default admin credentials
            String adminUsername = "admin";
            String adminPassword = "admin123";

            // Check if it's the admin account or student account
            if (username.equals(adminUsername) && password.equals(adminPassword)) {
                // Navigate to fco_homepage for admin
                Intent intent = new Intent(LogIn.this, fco_homepage.class);
                startActivity(intent);
                finish();
            } else if (username.equals(studentUsername) && password.equals(studentPassword)) {
                // Navigate to homepage for student
                Intent intent = new Intent(LogIn.this, homepage.class);
                startActivity(intent);
                finish();
            } else {
                // Show invalid login message
                Toast.makeText(LogIn.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
            }
        });

        // Forgot password logic
        forgot.setOnClickListener(view -> {
            Intent intent = new Intent(LogIn.this, forgot_password.class);
            startActivity(intent);
        });

        // Show/hide password logic
        showPassword.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                pass.setInputType(android.text.InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            } else {
                pass.setInputType(android.text.InputType.TYPE_CLASS_TEXT | android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD);
            }
        });
    }
}
