package com.example.product;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.common.activity.BaseActivity;
import com.example.common.constant.ConstantString;
import com.example.product.databinding.ActivityProductBinding;

/**
 * 产品展示页入口
 * */
@Route(path = ConstantString.ROUTER_PATH_PRODUCT)
public class ProductActivity extends BaseActivity {
    private static final String TAG = ProductActivity.class.getSimpleName();
    private ActivityProductBinding mActivityProductBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityProductBinding = ActivityProductBinding.inflate(getLayoutInflater());
        setContentView(mActivityProductBinding.getRoot());
    }
}