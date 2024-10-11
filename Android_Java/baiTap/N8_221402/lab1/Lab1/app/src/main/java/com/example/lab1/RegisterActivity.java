package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {
    EditText edEmail, edUsername, edPassword, edConfirm;
    AppCompatButton btnSignIn, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        edEmail = findViewById(R.id.edEmail);
        edUsername = findViewById(R.id.edUserName);
        edConfirm = findViewById(R.id.edConfirmPassword);
        edPassword = findViewById(R.id.edPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnCancel = findViewById(R.id.btnCancel);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isValid(edEmail.getText().toString())){
                    edEmail.setError("sai định dạng email");
                    return;
                }
                if (edUsername.getText().toString().isEmpty()){
                    edUsername.setError("User name không được bỏ trống");
                    return;
                }
                if (edPassword.getText().toString().isEmpty()){
                    edPassword.setError("mật khẩu không được để trống");
                }
                if (edPassword.getText().toString().length() < 6){
                    edPassword.setError("vui lòng đặt mẫu nhiều hơn 6 kí tự");
                }
                if (edConfirm.getText().toString().isEmpty()){
                    edConfirm.setError("vui lòng nhập lại mật khẩu để xác nhận mật khẩu");
                }
                if (edPassword.getText().toString().equals(edConfirm.getText().toString())){
                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    intent.putExtra("username", edUsername.getText().toString());
                    intent.putExtra("password", edPassword.getText().toString());
                    setResult(101, intent);
                    finish();
                }else {
                    edPassword.setError("Mật khẩu và xác nhận mật khẩu không khớp");
                    edConfirm.setText("");
                    return;
                }
            }
        });
    }
    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
}