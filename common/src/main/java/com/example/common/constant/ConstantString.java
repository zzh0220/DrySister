package com.example.common.constant;

public class ConstantString {
    private static final String TAG = ConstantString.class.getSimpleName();
    // 打开应用
    public static final String START_LOGIN_ACTIVITY = "start_login_activity";
    public static final String START_LAUNCHER_ACTIVITY = "start_launcher_activity";

    // 打开activity的action
    public static final String ACTION_LAUNCH_ACTIVITY_LAUNCHER = "android.intent.action.LauncherActivity";
    public static final String ACTION_LAUNCH_ACTIVITY_LOGIN = "android.intent.action.LoginActivity";
    public static final String ACTION_LAUNCH_ACTIVITY_PRODUCT = "android.intent.action.ProductActivity";
    public static final String ACTION_LAUNCH_ACTIVITY_PAY = "android.intent.action.PayActivity";

    // router
    public static final String ROUTER_PATH_LAUNCHER = "/launcher/launcherActivity";
    public static final String ROUTER_PATH_LOGIN = "/login/loginActivity";
    public static final String ROUTER_PATH_PRODUCT = "/product/productActivity";
    public static final String ROUTER_PATH_PAY = "/pay/payActivity";

    // database
    public static final String DA_LITE_NAME = "user_account";
    public static final String DA_LITE_TABLE_NAME = "account_and_pwd";

    // sharedPreference

    // service

    // broadcast
    public static final String BROADCAST_PERMISSION_INTERNAL = "com.drysister.permission.BROADCAST";
    public static final String BROADCAST_ACTION_INTERNAL = "com.drysister.permission.action_broadcast";

    // live data bus
    public static final String LIVE_DATA_BUS_ELEMENT_NAME = "android.arch.lifecycle.LiveData";
    public static final String LIVE_DATA_BUS_ELEMENT_METHOD = "observeForever";
}
