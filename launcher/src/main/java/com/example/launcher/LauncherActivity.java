package com.example.launcher;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
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

        // TODO: 2022/1/29 初始化应用
        initApplication();

        enterLoginActivity();
    }

    /**
     * 初始化应用，开启service、准备数据。。。。
     * */
    private void initApplication() {

    }


    /**
     * 应用初始化完成后，检查是否登录
     * */
    private void enterLoginActivity() {
        Log.d(TAG, "EnterLoginActivity");
        ARouter.getInstance().build(ConstantString.ROUTER_PATH_LOGIN).navigation();
    }
}