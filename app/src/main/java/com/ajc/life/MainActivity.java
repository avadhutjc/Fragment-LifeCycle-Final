package com.ajc.life;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "onCreate - MainActivity");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("TAG", "onStart - MainActivity");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("TAG", "onResume - MainActivity");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("TAG", "onPause - MainActivity");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("TAG", "onStop - MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG", "onRestart - MainActivity");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy - MainActivity");
    }
}