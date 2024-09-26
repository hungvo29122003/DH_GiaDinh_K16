package com.example.lab1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView tv = findViewById(R.id.tv1);
        EditText editText = findViewById(R.id.ed1);
        AppCompatButton btn_submit = findViewById(R.id.btn_Submit);
        btn_submit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
              //  tv.setText(editText.getText());
                String name = editText.getText().toString();
                tv.setText(name);
            }
        });

        }
}