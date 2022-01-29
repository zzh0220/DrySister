package com.example.login.login;

import com.example.login.user.UserAccountInfo;

/**
 * 用于检查用户输入的用户名和密码的有效性
 * */
public class CheckLoginInfo {
    private static final String TAG = CheckLoginInfo.class.getSimpleName();
    private UserAccountInfo mUserAccountInfo;

    public CheckLoginInfo(UserAccountInfo userAccountInfo) {
        this.mUserAccountInfo = userAccountInfo;
    }
}
