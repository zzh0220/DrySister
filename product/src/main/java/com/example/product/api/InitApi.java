package com.example.product.api;

import com.example.common.moduleInterface.IProductModuleApi;
import com.example.common.moduleInterface.RegisterInterface;
import com.example.product.item.ProductItemManager;

/**
 * @Author zhaozenghao
 * @Date 2022/5/9
 * @Description
 */
public class InitApi {
    private RegisterInterface mRegisterInterface = new RegisterInterface();

    public InitApi() {
        mRegisterInterface.setProductModuleApi(new IProductModuleApi() {
            @Override
            public double inquireProductOriginPrice(String productId) {
                return ProductItemManager.getInstance().getProductInfo(productId).getProductPriceOrigin();
            }
        });
    }
}
