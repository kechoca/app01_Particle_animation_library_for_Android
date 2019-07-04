package com.example.app01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.ibrahimsn.particle.ParticleView;

public class MainActivity extends AppCompatActivity {

    private ParticleView particleView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        particleView = findViewById(R.id.particleView);

    }

    @Override
    protected void onResume() {
        super.onResume();
        particleView.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        particleView.pause();
    }
}
