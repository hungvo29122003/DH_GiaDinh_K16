package com.example.checkbox;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
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
        AppCompatButton btn_KetQua = findViewById(R.id.btn_KetQua);
        AppCompatButton btn_GoiY = findViewById(R.id.btn_GoiY);
        CheckBox ck_int = findViewById(R.id.ck_Int);
        CheckBox ck_Double = findViewById(R.id.ck_Double);
        CheckBox ck_String = findViewById(R.id.ck_String);
        CheckBox ck_All = findViewById(R.id.ck_All);
        TextView tv_1 = findViewById(R.id.tv_1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ck_All.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ck_int.setChecked(isChecked);
                ck_int.setEnabled(!isChecked);
                ck_Double.setChecked(isChecked);
                ck_Double.setEnabled(!isChecked);
                ck_String.setChecked(isChecked);
                ck_String.setEnabled(!isChecked);
            }
        });
        ck_int.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "Int | true", Toast.LENGTH_LONG).show();
            }
        });
        ck_Double.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "Double | true", Toast.LENGTH_LONG).show();
            }
        });
        ck_String.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "String | true", Toast.LENGTH_LONG).show();
            }
        });
        btn_KetQua.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (ck_All.isChecked()) {
                    Toast.makeText(MainActivity.this, "đán án sai", Toast.LENGTH_LONG).show();
                    return;
                }
                String message = "";
                String s = "text view : ";
                if (ck_int.isChecked()) {
                    message = "đáp án sai";
                    s = ck_int.getText().toString();
//                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                }
                if (ck_Double.isChecked()) {
                    message = "đáp án sai";
                    s = ck_Double.getText().toString();
//                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                }
                if (ck_String.isChecked()) {
                    message = "đáp án đúng";
                    ck_int.setVisibility(View.GONE);
                    ck_Double.setVisibility(View.GONE);
                    ck_All.setVisibility(View.GONE);
                    s = ck_String.getText().toString();
                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                }
                if (!message.isEmpty()){
                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Không có tùy chọn nào được chọn", Toast.LENGTH_LONG).show();
                }
                tv_1.setText(s);
            }
        });
        btn_GoiY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ck_int.setChecked(true);
            }
        });
    }
}