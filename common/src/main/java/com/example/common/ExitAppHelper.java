package com.example.common;

import com.example.common.broadcast.BroadcastHelper;
import com.example.common.thread.ThreadManager;
import com.example.common.thread.ThreadPool;

/**
 * 用于在退出应用的时候释放所有资源
 */
public class ExitAppHelper {
    private static final String TAG = ExitAppHelper.class.getSimpleName();
    private volatile static ExitAppHelper mInstance;

    public static ExitAppHelper getInstance() {
        if (mInstance == null) {
            synchronized (ExitAppHelper.class) {
                if (mInstance == null) {
                    mInstance = new ExitAppHelper();
                }
            }
        }
        return mInstance;
    }

    /**
     * 退出应用主入口
     * */
    public void releaseResource() {
        unRegisterBroadcast();
        stopService();
        stopThread();
        System.exit(0);
    }

    /**
     * 取消注册所有广播
     * */
    public void unRegisterBroadcast() {
        BroadcastHelper.getInstance().unRegisterAllBroadcast();
    }

    /**
     * 停止所有服务
     * */
    public void stopService() {
    }

    /**
     * 停止所有线程
     * */
    public void stopThread() {
        // 关闭线程池
        ThreadPool.getInstance().shutDownThreadPool();
        ThreadManager.getInstance().clearAllResources();
    }

    /**
     * 记录退出时候的一些状态，用于下次启动读取，比如数据库等
     * */
    public void writeStatus() {
    }
}
