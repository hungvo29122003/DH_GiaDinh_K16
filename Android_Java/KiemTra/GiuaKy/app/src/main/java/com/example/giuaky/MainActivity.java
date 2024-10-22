package com.example.giuaky;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtHoVaTenText, edtMssvText, edtLyDoThamGia;
    CheckBox chkBongDa, chkNhacKich, chkKyThuat, chkVanHoc;
    DatePicker detePicker;
    Button btnDangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edtHoVaTenText = findViewById(R.id.edtHoVaTenText);
        edtMssvText = findViewById(R.id.edtMssvText);
        edtLyDoThamGia = findViewById(R.id.edtLyDoThamGia);
        Button btnDangKy = findViewById(R.id.btnDangKy);
         chkBongDa = findViewById(R.id.chkBongDa);
        chkNhacKich = findViewById(R.id.chkNhacKich);
         chkKyThuat = findViewById(R.id.chkKỹThuat);
         chkVanHoc = findViewById(R.id.chkVanHoc);
         detePicker = findViewById(R.id.datapicker1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleRegistration();
            }
        });
    }
    private void handleRegistration() {
        String hoVaTen = edtHoVaTenText.getText().toString().trim();
        String mssv = edtMssvText.getText().toString().trim();
        String lyDo = edtLyDoThamGia.getText().toString().trim();

        // Validate Full Name
        if (hoVaTen.isEmpty()){
            edtHoVaTenText.setError("Họ và tên không được để trống");
            return;
        }
        if (hoVaTen.length() < 12) {
            edtHoVaTenText.setError("Họ và tên phải có ít nhất 12 ký tự");
            return;
        }
        // Validate MSSV
        if (mssv.isEmpty()) {
            edtMssvText.setError("MSSV không được để trống");
            return;
        }
        if (!mssv.matches("\\d{8}")) {
            edtMssvText.setError("MSSV phải là số và đúng 8 chữ số");
            return;
        }

        int day = detePicker.getDayOfMonth();
        int month = detePicker.getMonth() + 1; // Months are 0-based
        int year = detePicker.getYear();
        String ngayDangKy = day + "/" + month + "/" + year;
        StringBuilder selectedClubs = new StringBuilder();
        if (chkBongDa.isChecked()) {
            selectedClubs.append("Bóng đá, ");
        }
        if (chkNhacKich.isChecked()) {
            selectedClubs.append("Nhạc kịch, ");
        }
        if (chkKyThuat.isChecked()) {
            selectedClubs.append("Kỹ thuật, ");
        }
        if (chkVanHoc.isChecked()) {
            selectedClubs.append("Văn học, ");
        }

        if (selectedClubs.length() == 0) {
            Toast.makeText(this, "Vui lòng chọn ít nhất 1 câu lạc bộ", Toast.LENGTH_SHORT).show();
            return;
        }
        String clubs = selectedClubs.substring(0, selectedClubs.length() - 2);
        if (lyDo.isEmpty()) {
            lyDo = "không có";
        }
        String registrationDetails = "Thông Tin Đăng Ký Câu Lạc Bộ:\n\n" +
                "Họ và Tên: " + hoVaTen + "\n" +
                "MSSV: " + mssv + "\n" +
                "Ngày Đăng Ký: " + day + "/" + month + "/" + year + "\n" +
                "Câu Lạc Bộ Đã Chọn: " + clubs + "\n" +
                "Lý Do Tham Gia: " + lyDo;
        showAlertDialog(registrationDetails);
        Intent intent = new Intent(MainActivity.this, RegistrationdetailsActivity.class);
        intent.putExtra("hoVaTen", hoVaTen);
        intent.putExtra("mssv", mssv);
        intent.putExtra("ngayDangKy",ngayDangKy );
        intent.putExtra("cauLacBo", clubs);
        intent.putExtra("lyDo", lyDo);
        startActivity(intent);
    }
    private void showAlertDialog(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Xác Nhận Đăng Ký");
        builder.setMessage(message);
        builder.setPositiveButton("OK", null);
        builder.show();
    }

}