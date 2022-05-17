package com.example.login.api;

import com.example.common.moduleInterface.ILoginModuleApi;
import com.example.common.moduleInterface.RegisterInterface;
import com.example.login.login.CheckLoginInfo;

/**
 * @Author zhaozenghao
 * @Date 2022/5/9
 * @Description
 */
public class InitApi {
    private RegisterInterface mRegisterInterface = new RegisterInterface();

    public InitApi() {
        mRegisterInterface.setLoginModuleApi(new ILoginModuleApi() {
            @Override
            public boolean isLogin(String userId, String userPhone) {
                CheckLoginInfo checkLoginInfo = new CheckLoginInfo();
                return checkLoginInfo.isLogin(userId, userPhone);
            }
        });
    }
}
