package com.example.launcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.common.livedatabus.LiveDataBus;

import org.greenrobot.eventbus.EventBus;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }
}