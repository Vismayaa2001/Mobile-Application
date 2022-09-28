package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,password;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.name);
        password=(EditText)findViewById(R.id.pass);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);


b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            name.setText("");
            password.setText("");
        }
    });
        b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            name.setText("");
            password.setText("");
        }
    });

    }
}