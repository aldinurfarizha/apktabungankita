package com.example.tabungankita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText nisn;
Button btnlihat;
String nisna;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nisn=(EditText)findViewById(R.id.txtnisn);
        btnlihat=(Button)findViewById(R.id.btnlihat);

        btnlihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nisna=nisn.getText().toString();
                Intent i = new Intent(MainActivity.this, hasil.class);
                i.putExtra("nisna", nisna);
                startActivity(i);
            }
        });
    }
}
