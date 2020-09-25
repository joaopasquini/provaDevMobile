package com.example.exercicio7;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Splash_Screen_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_activity);
        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                changeToHomeActivity();
            }
        }, 2000);

    }

    void changeToHomeActivity() {

        Intent intent = new Intent(Splash_Screen_Activity.this, HomeActivity.class);
        startActivity(intent);
        finish();

    }
}
