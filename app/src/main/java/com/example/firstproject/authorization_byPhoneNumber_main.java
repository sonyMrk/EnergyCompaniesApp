package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class authorization_byPhoneNumber_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_authorization_by_phone_number_main);
    }

    public void onClick(View view){
        Intent intent = new Intent(this, authorization_byPhoneNumber.class);
        startActivity(intent);
    }
}