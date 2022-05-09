package com.example.common.thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用于管理线程的创建和销毁
 */
public class ThreadManager {
    private static final String TAG = ThreadManager.class.getSimpleName();
    private volatile static ThreadManager mInstance;
    private Map<String, Thread> mThreadMap = new HashMap<>();

    public static ThreadManager getInstance() {
        if (mInstance == null) {
            synchronized (ThreadManager.class) {
                if (mInstance == null) {
                    mInstance = new ThreadManager();
                }
            }
        }
        return mInstance;
    }

    public void addThread(String threadName, Thread thread) {
        mThreadMap.put(threadName, thread);
    }

    public Thread getThread(String threadName) {
        if (mThreadMap.containsKey(threadName)) {
            return mThreadMap.get(threadName);
        }
        return null;
    }

    public void clearAllResources() {
        mThreadMap.clear();
        mInstance = null;
    }
}

