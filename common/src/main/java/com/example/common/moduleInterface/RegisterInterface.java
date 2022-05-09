package com.example.common.moduleInterface;

/**
 * @Author zhaozenghao
 * @Date 2022/5/9
 * @Description
 */
public class RegisterInterface {
    private IProductModuleApi IProductModuleApi;

    public RegisterInterface() {

    }

    public void setIProductModuleApi(IProductModuleApi IProductModuleApi) {
        this.IProductModuleApi = IProductModuleApi;
    }

    public IProductModuleApi getIProductModuleApi() {
        return IProductModuleApi;
    }
}
