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
        TextView txvLike=findViewById(R.id.txvLike);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        int id = radioGroup.getCheckedRadioButtonId();
        RadioButton seleted = findViewById(id);

        txvLike.setText("最愛組合是:"+seleted.getText());
    }
}
