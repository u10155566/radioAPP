package com.u1065206.radioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view) {
        //設定各屬性的值
        TextView txvLike=findViewById(R.id.txvLike);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        //讓seleted取得選中選項的值
        int id = radioGroup.getCheckedRadioButtonId();
        RadioButton seleted = findViewById(id);

        //讓答案顯示出選中選項的內容
        txvLike.setText("最愛組合是:"+seleted.getText());
    }
}
