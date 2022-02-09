package com.example.login;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.common.activity.BaseActivity;
import com.example.common.constant.ConstantString;
import com.example.login.databinding.ActivityLoginBinding;

@Route(path = ConstantString.ROUTER_PATH_LOGIN)
public class LoginActivity extends BaseActivity {
    private static final String TAG = LoginActivity.class.getSimpleName();
    private ActivityLoginBinding mActivityLoginBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityLoginBinding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(mActivityLoginBinding.getRoot());
        initView();

        // TODO: 2022/1/29 首先检查有没有登录，如果没有再跳转到登录界面
    }

    private void initView() {
        mActivityLoginBinding.btnActivityLoginLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //登陆后进入product界面
                ARouter.getInstance().build(ConstantString.ROUTER_PATH_PRODUCT).navigation();
                finish();
            }
        });

        mActivityLoginBinding.btnActivityLoginRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mActivityLoginBinding.btnActivityLoginUnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}