package com.example.android.birthdaycard;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button mButton;
    EditText tv1;
    EditText tv2;
    EditText tv3;
    String st1;
    String st2;
    String st3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.button_create);
        tv1 = findViewById(R.id.txtSub);
        tv2 = findViewById(R.id.txtSub2);
        tv3 = findViewById(R.id.txtSub3);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(
                        "Log_test", "onClick: done");
                Intent intent = new Intent(MainActivity.this, activity_2.class);
                st1 = tv1.getText().toString();
                st2 = tv2.getText().toString();
                st3 = tv3.getText().toString();
                intent.putExtra("value1", st1);
                intent.putExtra("value2", st2);
                intent.putExtra("value3", st3);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
