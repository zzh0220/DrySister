package com.example.login.user;

/**
 * 用户账户信息
 * */
public class UserAccountInfo {
    private static final String TAG = UserAccountInfo.class.getSimpleName();

    private String mAccountName;
    private String mAccountNumber;
    private String mAccountPwd;

    public String getAccountName() {
        return mAccountName;
    }

    public void setAccountName(String accountName) {
        this.mAccountName = accountName;
    }

    public String getAccountNumber() {
        return mAccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.mAccountNumber = accountNumber;
    }

    public String getAccountPwd() {
        return mAccountPwd;
    }

    public void setAccountPwd(String accountPwd) {
        this.mAccountPwd = accountPwd;
    }
}
