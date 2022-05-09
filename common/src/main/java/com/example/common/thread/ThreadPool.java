package com.example.common.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    private static final String TAG = ThreadPool.class.getSimpleName();

    private static ExecutorService mExecutorServiceCached;
    private static ExecutorService mExecutorServiceFixed;
    private static ExecutorService mExecutorServiceScheduled;
    private static ThreadPool mInstance;

    private static final int FIXED_THREAD_COUNT = 10;
    private static final int SCHEDULED_THREAD_COUNT = 5;

    public ThreadPool() {
        mExecutorServiceFixed = Executors.newFixedThreadPool(FIXED_THREAD_COUNT);
        mExecutorServiceCached = Executors.newCachedThreadPool();
        mExecutorServiceScheduled = Executors.newScheduledThreadPool(SCHEDULED_THREAD_COUNT);
    }

    public static ThreadPool getInstance() {
        if (mInstance == null) {
            synchronized (ThreadPool.class) {
                if (mInstance == null) {
                    mInstance = new ThreadPool();
                }
            }
        }
        return mInstance;
    }

    public static ExecutorService getExecutorServiceCached() {
        return mExecutorServiceCached;
    }

    public static ExecutorService getExecutorServiceFixed() {
        return mExecutorServiceFixed;
    }

    public static ExecutorService getExecutorServiceScheduled() {
        return mExecutorServiceScheduled;
    }

    public void shutDownThreadPool() {
        mExecutorServiceScheduled.shutdown();
        mExecutorServiceFixed.shutdown();
        mExecutorServiceCached.shutdown();
    }
}
