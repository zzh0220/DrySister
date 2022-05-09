package com.example.common.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

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

    /**
     * bind service
     */
    private void testBindService() {

    }

    ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {

        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };
}
