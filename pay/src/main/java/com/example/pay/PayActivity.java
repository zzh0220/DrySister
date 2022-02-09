package com.example.pay;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.common.activity.BaseActivity;
import com.example.common.constant.ConstantString;
import com.example.pay.databinding.ActivityPayBinding;

/**
 * 支付入口
 * */
@Route(path = ConstantString.ROUTER_PATH_PAY)
public class PayActivity extends BaseActivity {
    private static final String TAG = PayActivity.class.getSimpleName();
    private ActivityPayBinding mActivityPayBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityPayBinding = ActivityPayBinding.inflate(getLayoutInflater());
        setContentView(mActivityPayBinding.getRoot());
    }
}