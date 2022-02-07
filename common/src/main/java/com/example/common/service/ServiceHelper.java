package com.example.common.service;

import android.app.Service;

import java.util.ArrayList;

/**
 * 管理应用使用的service管理，单例模式，管理service，获取service
 */
public class ServiceHelper {
    private static final String TAG = ServiceHelper.class.getSimpleName();
    private ArrayList<Service> mServiceList;
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
     * 创建service，添加到mServiceList中
     * */
    public void startService(String serviceName) {
    }

    public void stopService(String serviceName) {

    }

    public void stopService() {

    }

}
