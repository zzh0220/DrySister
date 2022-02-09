package com.example.drysister;

import android.os.Bundle;

import com.example.common.activity.BaseActivity;
import com.example.common.context.ContextManager;

public class MainActivity extends BaseActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContextManager.setApplicationContext(this.getApplicationContext());
    }
}