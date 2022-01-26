package com.example.drysister;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.BuildConfig;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.common.constant.ConstantNumber;
import com.example.common.constant.ConstantString;
import com.example.drysister.databinding.ActivitySplashBinding;

/**
 * 应用入口，展示应用进入界面，并且作为广告页
 */

public class SplashActivity extends Activity {
    private static final String TAG = SplashActivity.class.getSimpleName();
    private ActivitySplashBinding mSplashBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (BuildConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(getApplication());
        mSplashBinding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(mSplashBinding.getRoot());

        AlphaAnimation alphaAnimation = new AlphaAnimation(ConstantNumber.FLOAT_0_DOT_1, ConstantNumber.FLOAT_0_DOT_1);
        alphaAnimation.setDuration(ConstantNumber.TIME_MS_1000); //设置动画播放时长1000毫秒（1秒）
        mSplashBinding.getRoot().startAnimation(alphaAnimation);
        //设置动画监听
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            //动画结束
            @Override
            public void onAnimationEnd(Animation animation) {
                //页面的跳转
                ARouter.getInstance().build(ConstantString.ROUTER_PATH_LAUNCHER).navigation();
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
    }
}
