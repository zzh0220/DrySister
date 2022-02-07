package com.example.drysister;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.common.context.ContextManager;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContextManager.setApplicationContext(this.getApplicationContext());
    }
}