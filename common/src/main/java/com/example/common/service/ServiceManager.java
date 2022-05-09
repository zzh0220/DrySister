package com.example.common.service;

import android.content.Intent;

import com.example.common.context.ContextManager;

import java.util.HashMap;

/**
 * 管理应用使用的service管理，单例模式，管理service，获取service
 */
public class ServiceManager {
    private static final String TAG = ServiceManager.class.getSimpleName();
    private volatile static ServiceManager mInstance;

    public static ServiceManager getInstance() {
        if (mInstance == null) {
            synchronized (ServiceManager.class) {
                if (mInstance == null) {
                    mInstance = new ServiceManager();
                }
            }
        }
        return mInstance;
    }

    /**
     * 创建service，添加到mServiceMap中
     * */
    public void addService(String serviceName, Intent serviceIntent) {
    }

    /**
     * 销毁service
     * */
    public void stopService(String serviceName, Intent serviceIntent) {
    }
}
