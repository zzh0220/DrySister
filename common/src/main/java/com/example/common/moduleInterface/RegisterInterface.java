package com.example.common.moduleInterface;

/**
 * @Author zhaozenghao
 * @Date 2022/5/9
 * @Description all module can register interface here, and call other module's function
 */
public class RegisterInterface {
    private IProductModuleApi productModuleApi;
    private IAppModuleApi appModuleApi;
    private ILauncherModuleApi launcherModuleApi;
    private ILoginModuleApi loginModuleApi;
    private IMediaModuleApi mediaModuleApi;
    private IPayModuleApi payModuleApi;


    public RegisterInterface() {

    }

    public IAppModuleApi getAppModuleApi() {
        return appModuleApi;
    }

    public void setAppModuleApi(IAppModuleApi appModuleApi) {
        this.appModuleApi = appModuleApi;
    }

    public ILauncherModuleApi getLauncherModuleApi() {
        return launcherModuleApi;
    }

    public void setLauncherModuleApi(ILauncherModuleApi launcherModuleApi) {
        this.launcherModuleApi = launcherModuleApi;
    }

    public ILoginModuleApi getLoginModuleApi() {
        return loginModuleApi;
    }

    public void setLoginModuleApi(ILoginModuleApi loginModuleApi) {
        this.loginModuleApi = loginModuleApi;
    }

    public IMediaModuleApi getMediaModuleApi() {
        return mediaModuleApi;
    }

    public void setMediaModuleApi(IMediaModuleApi mediaModuleApi) {
        this.mediaModuleApi = mediaModuleApi;
    }

    public IPayModuleApi getPayModuleApi() {
        return payModuleApi;
    }

    public void setPayModuleApi(IPayModuleApi payModuleApi) {
        this.payModuleApi = payModuleApi;
    }

    public void setProductModuleApi(IProductModuleApi productModuleApi) {
        this.productModuleApi = productModuleApi;
    }

    public IProductModuleApi getProductModuleApi() {
        return productModuleApi;
    }
}
