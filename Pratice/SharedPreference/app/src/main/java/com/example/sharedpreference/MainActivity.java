package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mbtncontinue;
    EditText metPhoneNumber, metEmaild, metLastName, metFirstName;
    TextView mtvFirstname, mtvLastName, mtvEmail, mtvPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intidviews();
        mbtncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondScreen.class);
                startActivity(intent);
            }
        });

    }
    private void intidviews() {
        mbtncontinue = findViewById(R.id.btncontinue);
        metPhoneNumber = findViewById(R.id.etPhoneNumber);
        metEmaild = findViewById(R.id.etEmaild);
        metFirstName = findViewById(R.id.etFirstName);
        metLastName = findViewById(R.id.etLastName);
        mbtncontinue=findViewById(R.id.btncontinue);
        PreferenceHelpher.getInstance(this);
        String firstnname = metFirstName.getText().toString().trim();
        PreferenceHelpher.writeStringToPreference("firstnname","sid");
    }
}