package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InfoActivity extends AppCompatActivity {
    EditText edName, edEmail, edPassword, edUsername;
    RadioGroup rdbButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_info);
        edName = findViewById(R.id.edName);
        edEmail = findViewById(R.id.edEmail);
        edUsername = findViewById(R.id.edUserName);
        edPassword = findViewById(R.id.edPassword);
        ;
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
        edUsername.setText(intent.getStringExtra("Username"));
        edPassword.setText(intent.getStringExtra("Password"));
        edEmail.setText(intent.getStringExtra("Email"));
    }
}