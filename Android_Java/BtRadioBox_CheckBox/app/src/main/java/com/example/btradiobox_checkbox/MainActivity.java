package com.example.btradiobox_checkbox;

import android.icu.number.NumberRangeFormatter;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        CheckBox cb_KemOption1 = findViewById(R.id.cb_kemOption1);
        CheckBox cb_KemOption2 = findViewById(R.id.cb_kemOption2);
        CheckBox cb_KemOption3 = findViewById(R.id.cb_kemOption3);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
//        TextView tv_ShowOptionKem = findViewById(R.id.tv_ShowKemOption);
        RadioButton rb_SizeS = findViewById(R.id.rb_Option1);
        RadioButton rb_SizeM = findViewById(R.id.rb_Option2);
        RadioButton rb_SizeL = findViewById(R.id.rb_Option3);
        TextView tv_ShowOptionSize = findViewById(R.id.tv_ShowOptionSize);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        CompoundButton.OnCheckedChangeListener sizeDaChon = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                RadioButton rb_SizeS = findViewById(R.id.rb_Option1);
                RadioButton rb_SizeM = findViewById(R.id.rb_Option2);
                RadioButton rb_SizeL = findViewById(R.id.rb_Option3);
                String s ="";
                if (rb_SizeS.isChecked()){
                    s = rb_SizeS.getText().toString();
                }
                if (rb_SizeM.isChecked()){
                    s = rb_SizeM.getText().toString();
                }
                if (rb_SizeL.isChecked()){
                    s = rb_SizeL.getText().toString();
                }
                if (!s.isEmpty()){
                    tv_ShowOptionSize.setText(s);
                } else {
                    tv_ShowOptionSize.setText("chưa chọn size");
                }
            }
        };
        rb_SizeS.setOnCheckedChangeListener(sizeDaChon);
        rb_SizeM.setOnCheckedChangeListener(sizeDaChon);
        rb_SizeL.setOnCheckedChangeListener(sizeDaChon);
        CompoundButton.OnCheckedChangeListener kemDachon = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                CheckBox cb_KemOption1 = findViewById(R.id.cb_kemOption1);
                CheckBox cb_KemOption2 = findViewById(R.id.cb_kemOption2);
                CheckBox cb_KemOption3 = findViewById(R.id.cb_kemOption3);
                TextView  tv_ShowOptionKem = findViewById(R.id.tv_ShowKemOption);
                String result = "";
                if (cb_KemOption1.isChecked()){
                    result = result +  cb_KemOption1.getText().toString() + ",";
                }
                if (cb_KemOption2.isChecked()){
                    result = result +  cb_KemOption2.getText().toString() + ",";
                }
                if (cb_KemOption3.isChecked()){
                    result = result +  cb_KemOption3.getText().toString() + ",";
                }
                if (result.isEmpty()) {
                    result = "chưa chọn kem";
                } else {
                    result = result.substring(0, result.length() -1);
                }
                tv_ShowOptionKem.setText(result);
            }
        };
        cb_KemOption2.setOnCheckedChangeListener(kemDachon);
        cb_KemOption1.setOnCheckedChangeListener(kemDachon);
        cb_KemOption3.setOnCheckedChangeListener(kemDachon);
    }
}