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


        user = findViewById(R.id.etUsername);
        pass = findViewById(R.id.etPassword);
        log = findViewById(R.id.btnLogin);
        showPassword = findViewById(R.id.cbShowPassword);
        TextView forgot = findViewById(R.id.forgotPassword);


        log.setOnClickListener(v -> {
            String username = user.getText().toString().trim();
            String password = pass.getText().toString().trim();


            if (username.equals("student") && password.equals("12345")) {

                Intent intent = new Intent(LogIn.this, homepage.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(LogIn.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
            }
        });


        forgot.setOnClickListener(view -> {
            Intent intent = new Intent(LogIn.this, forgot_password.class);
            startActivity(intent);
        });


        showPassword.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // Show password
                pass.setInputType(android.text.InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            } else {
                // Hide password
                pass.setInputType(android.text.InputType.TYPE_CLASS_TEXT | android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD);
            }
        });
    }
}
