package com.example.pay.api;

import com.example.common.moduleInterface.IPayModuleApi;
import com.example.common.moduleInterface.RegisterInterface;
/**
 * @Author zhaozenghao
 * @Date 2022/5/9
 * @Description
 */
public class InitApi {
    private RegisterInterface mRegisterInterface = new RegisterInterface();

    public InitApi() {
        mRegisterInterface.setPayModuleApi(new IPayModuleApi() {
            @Override
            public boolean isPaySuccess() {
                return false;
            }
        });
    }
}
