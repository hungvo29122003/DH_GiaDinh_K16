package com.example.scrollview;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

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
        AppCompatButton btn_ScrollUp = findViewById(R.id.btn_ScrollUp);
        AppCompatButton btn_scrollDown = findViewById(R.id.btn_ScrollDown);
        ScrollView scrollView = findViewById(R.id.scrollView);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn_ScrollUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int targetY = 0;
                scrollView.fullScroll(scrollView.FOCUS_UP);
            }
        });
        btn_scrollDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.fullScroll(scrollView.FOCUS_DOWN);
            }
        });
    }
}