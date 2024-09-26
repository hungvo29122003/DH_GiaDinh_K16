package com.example.application_facebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        AppCompatButton btn_Login = findViewById(R.id.btn_Login);
        EditText ed_emailOrPhone = findViewById(R.id.ed_email_Text);
        EditText ed_Pass = findViewById(R.id.ed_pass_Text);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailOrPhone = ed_emailOrPhone.getText().toString();
                String pass = ed_Pass.getText().toString();
                if (emailOrPhone.isEmpty()){
                    Toast.makeText(MainActivity.this, "Email or phone cannot be empty", Toast.LENGTH_LONG).show();
                    return;
                }
                if (pass.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter password", Toast.LENGTH_LONG).show();
                } else {
                    if (isvalidEmail(emailOrPhone) || isvalidPhone(emailOrPhone)) {
                        Intent intent = new Intent(MainActivity.this, MainfacebookActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "Invalid email or phone format", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

    }
    public  boolean isvalidEmail(String email){
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }
    public boolean isvalidPhone(String phone){
        if ( phone.length() != 10){
            return false;
        }else {
            for (char p : phone.toCharArray()){
                int o = (int)p;
                if (((o>= 65) && (o <= 90)) || ((o >= 97) && (o<=122))){
                    return false;
                }
            }
        }
        return true;
    }

}