package com.example.girdview;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        GridView gridView = findViewById(R.id.girdview1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //b1 raw data
//        String [] ten ={"An", "Hung", "Thu", "Tien"};
//        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, ten);
//        gridView.setAdapter(adapter);

//        ArrayList<HouseItem> arrayList = new ArrayList<>();
//        arrayList.add(new HouseItem("Nhà trắng", R.drawable.img_test));
//        arrayList.add(new HouseItem("Nhà đen", R.drawable.img_test));
//        arrayList.add(new HouseItem("Nhà đỏ", R.drawable.img_test));
//        arrayList.add(new HouseItem("Nhà xanh", R.drawable.img_test));
//        HouseAdapter adapter = new HouseAdapter(MainActivity.this, R.layout.activity_house_item,arrayList);
//        gridView.setAdapter(adapter);
//         button = findViewById(R.id.btnClick);
//         registerForContextMenu(button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                showMenu();
//            }
//        });
    }
//    public void click_Go(View view){
//        Intent intent = new Intent(MainActivity.this, DemoActivity.class);
//        startActivity(intent);
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_option, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int id = item.getItemId();
//        if (id == R.id.item_add){
//            Toast.makeText(this, "Add được chọn", Toast.LENGTH_LONG).show();
//        } else {
//            Toast.makeText(this, "Question được chọn", Toast.LENGTH_LONG).show();
//        }
//        return super.onOptionsItemSelected(item);
//    }
//    public void showMenu(){
//        PopupMenu popupMenu = new PopupMenu(this, button);
//        getMenuInflater().inflate(R.menu.menu_option, popupMenu.getMenu());
//        popupMenu.show();
//    }
//
//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        getMenuInflater().inflate(R.menu.menu_comtext,menu);
//        menu.setHeaderTitle("Chọn");
//        super.onCreateContextMenu(menu, v, menuInfo);
//    }
}