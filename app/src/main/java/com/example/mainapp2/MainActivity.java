package com.example.mainapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.libraryutil.LbUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LbUtil.run();
    }
}