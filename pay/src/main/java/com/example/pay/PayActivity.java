package com.example.pay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.pay.databinding.ActivityPayBinding;

/**
 * 支付入口
 * */
public class PayActivity extends AppCompatActivity {
    private static final String TAG = PayActivity.class.getSimpleName();
    private ActivityPayBinding mActivityPayBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityPayBinding = ActivityPayBinding.inflate(getLayoutInflater());
        setContentView(mActivityPayBinding.getRoot());
    }
}