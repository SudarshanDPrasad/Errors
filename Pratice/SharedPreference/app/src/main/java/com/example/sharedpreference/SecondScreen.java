package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {
    Button mbtncontinue;
    TextView metPhoneNumber1, metEmaild1, metLastName1, metFirstName1, metDate, metnoofseats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        intidviews();
        PreferenceHelpher.getInstance(this);
        String data = PreferenceHelpher.getIntSharedPreferenceKey("firstnname");
        metFirstName1.setText(data);
    }

    private void intidviews() {
        metEmaild1 = findViewById(R.id.etEmaild1);
        metFirstName1 = findViewById(R.id.etFirstName1);
        metLastName1 = findViewById(R.id.etLastName1);
        metPhoneNumber1 = findViewById(R.id.etPhoneNumber1);
        mbtncontinue = findViewById(R.id.btncontinue);
        metDate = findViewById(R.id.etDate);
        metnoofseats = findViewById(R.id.etnoofseats);
    }
}