package com.example.common.thread;

/**
 * 用于管理线程的创建和销毁
 * */
public class ThreadHelper {
    private static final String TAG = ThreadHelper.class.getSimpleName();
    private volatile static ThreadHelper mInstance;

    public static ThreadHelper getInstance() {
        if (mInstance == null) {
            synchronized (ThreadHelper.class) {
                if(mInstance == null) {
                    mInstance = new ThreadHelper();
                }
            }
        }
        return mInstance;
    }


}
