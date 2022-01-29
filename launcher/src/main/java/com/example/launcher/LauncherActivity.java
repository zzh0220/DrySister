package com.example.launcher;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.common.constant.ConstantString;
import com.example.launcher.databinding.ActivityLauncherBinding;

/**
 * Launcher模块负责初始化应用
 * */
@Route(path = ConstantString.ROUTER_PATH_LAUNCHER)
public class LauncherActivity extends AppCompatActivity {
    private static final String TAG = LauncherActivity.class.getSimpleName();
    private ActivityLauncherBinding mActivityLauncherBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityLauncherBinding = ActivityLauncherBinding.inflate(getLayoutInflater());
        setContentView(mActivityLauncherBinding.getRoot());
    }
}