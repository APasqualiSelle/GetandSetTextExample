package com.selle.aline.getandsettextexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.btn);
        final EditText e1 = findViewById(R.id.edit_name);
        final EditText e2 = findViewById(R.id.edit_city);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                intent.putExtra("name",e1.getText().toString());
               intent.putExtra("city",e2.getText().toString());
                startActivity(intent);
            }
        });
    }
}
