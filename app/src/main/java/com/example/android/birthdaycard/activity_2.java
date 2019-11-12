package com.example.android.birthdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class activity_2 extends AppCompatActivity {

    TextView et1;
    TextView et2;
    TextView et3;
    String st1;
    String st2;
    String st3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.d(
                "Log_text",
                "onCreate: done");

        et1=findViewById(R.id.edit_value1);
        et2=findViewById(R.id.edit_value3);
        et3=findViewById(R.id.edit_value2);

        st1 = getIntent().getStringExtra(
                "value1");
        st2 = getIntent().getStringExtra(
                "value2");
        st3 = getIntent().getStringExtra(
                "value3");
        et1.setText(st1);
        et2.setText(st2);
        et3.setText(st3);
    }
}
