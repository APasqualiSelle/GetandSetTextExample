package com.selle.aline.getandsettextexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView t1 = findViewById(R.id.text_name);
        final TextView t2 = findViewById(R.id.text_city);

        t1.setText(getIntent().getExtras().getString("name"));
       t2.setText(getIntent().getExtras().getString("city"));


    }
}
