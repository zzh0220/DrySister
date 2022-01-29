package com.example.product;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.product.databinding.ActivityProductBinding;

/**
 * 产品展示页入口
 * */
public class ProductActivity extends AppCompatActivity {
    private static final String TAG = ProductActivity.class.getSimpleName();
    private ActivityProductBinding mActivityProductBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityProductBinding = ActivityProductBinding.inflate(getLayoutInflater());
        setContentView(mActivityProductBinding.getRoot());
    }
}