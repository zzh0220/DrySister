package com.example.common.context;

import android.content.Context;

/**
 * 用于提供context和管理context
 * */
public class ContextManager {
    private static final String TAG = ContextManager.class.getSimpleName();
    private static Context mContext;

    public static void setApplicationContext(Context context) {
        mContext = context;
    }

    public static Context getApplicationContext() {
        return mContext;
    }

}
