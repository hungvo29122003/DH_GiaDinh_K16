package com.example.sumtwoso;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE_RESULT = 1;
    private ActivityResultLauncher<Intent> resultLauncher;
    TextView tvKetQua;
    EditText edNumber1, edNumber2;
    AppCompatButton btnCong, btnTru, btnNhan, btnChia;
    double result;

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
        btnChia = findViewById(R.id.btnChia);
        btnNhan = findViewById(R.id.btnNhan);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        edNumber1 = findViewById(R.id.edSoThu1);
        edNumber2 = findViewById(R.id.edSoThu2);
        tvKetQua = findViewById(R.id.tvKetQua);
//        resultLauncher = registerForActivityResult(
//                new ActivityResultContracts.StartActivityForResult(),
//                new ActivityResultCallback<ActivityResult>() {
//                    @Override
//                    public void onActivityResult(ActivityResult result) {
//                        if (result.getResultCode() == 1) {
//                            Intent data = result.getData();
//                            if (data != null && data.hasExtra("result")) {
//                                double resultDouble = data.getDoubleExtra("result", 0.0);
//                                tvKetQua.setText(String.valueOf(resultDouble));
//                            }
//                        }
//                    }
//                }
//        );
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation("cong");
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation("tru");
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation("nhan");
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation("chia");
            }
        });
    }

    private void Operation(String operationType) {
        String number1Text = edNumber1.getText().toString().trim();
        String number2Text = edNumber2.getText().toString().trim();
        if (number1Text.isEmpty() || number2Text.isEmpty()) {
            Toast.makeText(MainActivity.this, "VUI LÒNG NHẬP ĐẦY ĐỦ 2 SỐ", Toast.LENGTH_LONG).show();
            return;
        }
        double number1, number2;
        try {
            number1 = Double.parseDouble(number1Text);
            number2 = Double.parseDouble(number2Text);
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Vui lòng nhập số hợp lệ", Toast.LENGTH_LONG).show();
            return;
        }
        switch (operationType){
            case "cong" :
                result = number1 + number2;
                break;
            case "tru":
                result = number1 - number2;
                break;
            case "nhan":
                result = number1 * number2;
                break;
            default:
                result = number1 / number2;
                break;
        }
//         if (operationType.equals("cong")) {
//            result = number1 + number2;
//        } else if (operationType.equals("tru")){
//            result = number1 - number2;
//        } else if (operationType.equals("nhan")) {
//            result = number1 * number2;
//        } else {
//            result = number1 / number2;
//        }
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra("result", result);
        intent.putExtra("operation", operationType);
//        resultLauncher.launch(intent);
        startActivityForResult(intent, REQUEST_CODE_RESULT);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_RESULT) {
            if (resultCode == RESULT_OK && data != null && data.hasExtra("result")) {
                double returnedResult = data.getDoubleExtra("result", 0.0);
                tvKetQua.setText(String.valueOf(returnedResult));
                Toast.makeText(this, "Nhận kết quả từ ResultActivity", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Không nhận được dữ liệu từ ResultActivity", Toast.LENGTH_SHORT).show();
            }
        }
    }
}