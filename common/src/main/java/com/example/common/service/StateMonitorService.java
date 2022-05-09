package com.example.common.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

/**
 * @Author zhaozenghao
 * @Date 2022/5/9
 * @ClassName StateMonitorService
 * @Description monitor the states that affect app , to instead of broadcast
 */
public class StateMonitorService extends Service {
    private static final String TAG = StateMonitorService.class.getSimpleName();

    private final Binder mBinder = new LocalBinder();

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    public class LocalBinder extends Binder {
        public StateMonitorService getService() {
            return StateMonitorService.this;
        }
    }
}


