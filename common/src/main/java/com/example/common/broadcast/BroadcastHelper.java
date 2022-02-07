package com.example.common.broadcast;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

import com.example.common.constant.ConstantString;
import com.example.common.context.ContextManager;

import java.util.ArrayList;

/**
 * 用于管理广播的创建和销毁
 */
public class BroadcastHelper {
    private static final String TAG = BroadcastHelper.class.getSimpleName();
    private volatile static BroadcastHelper mInstance;
    private ArrayList<BroadcastReceiver> mBroadcastReceiverList;

    public static BroadcastHelper getInstance() {
        if (mInstance == null) {
            synchronized (BroadcastHelper.class) {
                if (mInstance == null) {
                    mInstance = new BroadcastHelper();
                }
            }
        }
        return mInstance;
    }

    /**
     * 释放广播
     */
    public void unRegisterBroadcast(BroadcastReceiver broadcastReceiver) {
        ContextManager.getApplicationContext().unregisterReceiver(broadcastReceiver);
    }

    /**
     * 释放all广播
     */
    public void unRegisterAllBroadcast() {
        for(BroadcastReceiver broadcastReceiver : mBroadcastReceiverList) {
            ContextManager.getApplicationContext().unregisterReceiver(broadcastReceiver);
        }
    }

    /**
     * 新建广播
     * */
    public void registerBroadcast(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        //需要具有对应权限的应用才能够接收到广播
        ContextManager.getApplicationContext().registerReceiver(broadcastReceiver, intentFilter,
                ConstantString.BROADCAST_PERMISSION_INTERNAL, null);
        mBroadcastReceiverList.add(broadcastReceiver);
    }
}
