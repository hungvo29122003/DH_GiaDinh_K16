package com.example.listview;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int viTri = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.lv1);
        EditText edtText = findViewById(R.id.edt_text);
        Button btnAdd = findViewById(R.id.btnThem);
        Button btnSua = findViewById(R.id.btnSua);
//        // b1 tạo raw data
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("An");
//        arrayList.add("Thơ");
//        arrayList.add("Nụ");
//
//        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);
//
//        //b3 hiển thị lên listView
//        listView.setAdapter(adapter);
//
//        //truy suất
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "vi trí " + position + " " + arrayList.get(position), Toast.LENGTH_LONG).show();
//                edtText.setText(arrayList.get(position));
//                viTri = position ;
//            }
//        });
//        //thêm
//        btnAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String s = edtText.getText().toString();
//                arrayList.add(s);
//                adapter.notifyDataSetChanged();
//            }
//        });
//        // sửa
//        btnSua.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                arrayList.set(viTri, edtText.getText().toString());
//                adapter.notifyDataSetChanged();
//                edtText.setText("");
//            }
//        });
//        //xóa
//        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                builder.setTitle("Xác Nhận ");
//                builder.setMessage("Bạn có muốn xóa item không!");
//                builder.setPositiveButton("có", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        arrayList.remove(position);
//                        adapter.notifyDataSetChanged();
//                        Toast.makeText(MainActivity.this, "Xóa thành công " + arrayList.get(position), Toast.LENGTH_LONG).show();
//                    }
//                });
//                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        dialog.dismiss();
//                    }
//                });
//                builder.show();
//                return true;
//            }
//        });
        //có sử dụng SinhVienAdapter
        //b1 tạo data
        ArrayList<SinhVien> arrayList = new ArrayList<>();
        arrayList.add(new SinhVien("An", 20));
        arrayList.add(new SinhVien("Hùng", 21));
        arrayList.add(new SinhVien("abc", 20));
        //b2 tạo adapter
        SinhVienAdapter adapter = new SinhVienAdapter(MainActivity.this, R.layout.item_sinhvien,arrayList);
        //b3 hiển thị
        listView.setAdapter(adapter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}