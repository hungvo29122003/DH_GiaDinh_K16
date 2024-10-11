package com.example.sumtwoso;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResultActivity extends AppCompatActivity {

    private double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.result);
        ImageView ivBack = findViewById(R.id.ivBack);
        TextView tvShowKetQua = findViewById(R.id.tvShowKetQua);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("result")){
            result = intent.getDoubleExtra("result", 0.0);
            String operation = intent.getStringExtra("operation");
            String operationText = "";
            if ("cong".equals(operation)){
                operationText = "kết quả phép cộng";
            } else if ("tru".equals(operation)) {
                operationText = "kết quả phép trừ";
            } else if ("nhan".equals(operation)) {
                operationText = "kết quả phép nhân";
            } else if ("chia".equals(operation)) {
                operationText = "kết quả phép chia";
            }
            tvShowKetQua.setText(operationText  +":"+  String.valueOf(result));
        } else {
            tvShowKetQua.setText("lỗi: Không nhận dữ liệu được");
            ivBack.setEnabled(false);
            Toast.makeText(this, "Không nhận được dữ liệu kết quả", Toast.LENGTH_LONG).show();
        }
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (intent != null && intent.hasExtra("result")){
                    Intent data = new Intent();
                    data.putExtra("result", result);
//                    setResult(1, data);
                    setResult(RESULT_OK, data);
                    finish();
                } else {
                    setResult(RESULT_CANCELED);
//                    setResult(0);
                    finish();
                }
            }
        });
    }
}