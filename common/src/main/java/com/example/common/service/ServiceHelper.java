package com.example.common.service;

import android.app.Service;
import android.content.Intent;

import com.example.common.context.ContextManager;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 管理应用使用的service管理，单例模式，管理service，获取service
 */
public class ServiceHelper {
    private static final String TAG = ServiceHelper.class.getSimpleName();
    private HashMap<String, Intent> mServiceMap;
    private volatile static ServiceHelper mInstance;

    public static ServiceHelper getInstance() {
        if (mInstance == null) {
            synchronized (ServiceHelper.class) {
                if (mInstance == null) {
                    mInstance = new ServiceHelper();
                }
            }
        }
        return mInstance;
    }

    /**
     * 创建service，添加到mServiceMap中
     * */
    public void startService(String serviceName, Intent serviceIntent) {
        ContextManager.getApplicationContext().startService(serviceIntent);
        mServiceMap.put(serviceName, serviceIntent);
    }

    /**
     * 销毁service
     * */
    public void stopService(String serviceName, Intent serviceIntent) {
        ContextManager.getApplicationContext().stopService(serviceIntent);
        mServiceMap.remove(serviceName);
    }
}
