package com.example.radiobutton;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        RadioGroup rg = findViewById(R.id.radioGroup);
       ImageView image = findViewById(R.id.imageView_Bi);
        RadioButton rbA = findViewById(R.id.rb_A);
        RadioButton rbB = findViewById(R.id.rb_B);
        RadioButton rbC = findViewById(R.id.rb_C);
        TextView tv1 = findViewById(R.id.tv_1);
        AppCompatButton btn_Submit = findViewById(R.id.btn_Submit);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rb_A){
                    image.setVisibility(View.GONE);

                } else if (checkedId == R.id.rb_B) {
                    image.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(MainActivity.this, "chưa cập nhật nút này", Toast.LENGTH_LONG).show();
                }
            }
        });
        btn_Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                if (rbA.isChecked()){
                    tv1.setVisibility(View.VISIBLE);
                    s = rbA.getText().toString();
                }
                if (rbB.isChecked()){
                    s = rbB.getText().toString();
                }
                tv1.setText(s);
            }
        });


    }
}