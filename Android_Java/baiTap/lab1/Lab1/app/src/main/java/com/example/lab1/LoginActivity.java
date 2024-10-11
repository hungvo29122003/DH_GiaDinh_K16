package com.example.lab1;

import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.DialogTitle;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    EditText edtUserName, edtPassword;
    AppCompatButton btnLogin, btn_Register, btnLoginWithFb, btnLoginWithGg, btnOk, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        edtUserName = findViewById(R.id.edtUserName);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btn_Register = findViewById(R.id.btnRegister);
        btnLoginWithFb = findViewById(R.id.btnLoginFacebook);
        btnLoginWithGg = findViewById(R.id.btnLoginGoogle);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtUserName.getText().toString().trim().isEmpty() || edtPassword.getText().toString().trim().isEmpty()){
                    final Dialog dialog = new Dialog(LoginActivity.this);
                    dialog.setContentView(R.layout.activity_dialog);
                    btnOk = dialog.findViewById(R.id.btnOk);
                    btnCancel = dialog.findViewById(R.id.btnCancel);
                    btnOk.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                            startActivityForResult(intent, 100);
                            dialog.dismiss();
                        }
                    });
                    btnCancel.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.cancel();
                        }
                    });
                    dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
                    dialog.show();

                } else if (edtPassword.getText().toString().length() <6){
                    edtPassword.setError("Độ dài tối thiếu là 6 kí tự");
                } else {
                    EditText edMail = findViewById(R.id.edEmail);
                    Intent intent = new Intent(LoginActivity.this, InfoActivity.class);
                    intent.putExtra("UserName", edtUserName.getText().toString());
                    intent.putExtra("Password", edtPassword.getText().toString());
                    intent.putExtra("Email", edMail.getText().toString());
                    startActivityForResult(intent, 102);
                }
            }
        });
        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivityForResult(intent, 100);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == 101){
            edtUserName.setText(data.getStringExtra("username"));
            edtPassword.setText(data.getStringExtra("password"));
        }
        if (requestCode == 102 && resultCode == 101){
            edtUserName.setText(data.getStringExtra("username"));
            edtPassword.setText(data.getStringExtra("password"));
        }
    }
}