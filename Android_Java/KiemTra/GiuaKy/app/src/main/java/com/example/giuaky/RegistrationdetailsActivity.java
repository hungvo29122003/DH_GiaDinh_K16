package com.example.giuaky;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegistrationdetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.registrationdetails);
        TextView tvRegistrationDetails = findViewById(R.id.tvRegistrationDetails);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String hoVaTen = extras.getString("hoVaTen");
            String mssv = extras.getString("mssv");
            String ngayDangKy = extras.getString("ngayDangKy");
            String cauLacBo = extras.getString("cauLacBo");
            String lyDo = extras.getString("lyDo");

            // Tạo chuỗi thông tin đăng ký
            String registrationDetails = "Thông tin đăng ký câu lạc bộ:\n\n" +
                    "Họ và tên: " + hoVaTen + "\n" +
                    "MSSV: " + mssv + "\n" +
                    "Ngày đăng ký: " + ngayDangKy + "\n" +
                    "Câu lạc bộ: " + cauLacBo + "\n" +
                    "Lý do tham gia: " + lyDo;

            // Hiển thị thông tin lên TextView
            tvRegistrationDetails.setText(registrationDetails);
        }
    }
}