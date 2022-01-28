package com.example.launcher;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.common.constant.ConstantString;

/**
 * Launcher模块负责初始化应用
 * */
@Route(path = ConstantString.ROUTER_PATH_LAUNCHER)
public class LauncherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }
}