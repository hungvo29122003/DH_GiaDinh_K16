package com.example.application_linear_layout;

import android.os.Bundle;
import android.view.View;
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
        TextView tv = findViewById(R.id.tv1);
        AppCompatButton btn_Toast = findViewById(R.id.btn_Toast);
        AppCompatButton btn_Count = findViewById(R.id.btn_Count);
        EditText ed = findViewById(R.id.ed_text);
        btn_Toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentText = tv.getText().toString();
                ed.setText("the current count is :  " + currentText );
                Toast.makeText(MainActivity.this,"Current count" + currentText, Toast.LENGTH_LONG).show();
            }
        });
        btn_Count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentText = tv.getText().toString();
                int currentValue = Integer.parseInt(currentText);
                int newValue = currentValue + 1;
                tv.setText(String.valueOf(newValue));
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}