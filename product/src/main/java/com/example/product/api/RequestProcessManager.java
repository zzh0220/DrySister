package com.example.product.api;

import com.example.common.moduleInterface.IProductModuleApi;
import com.example.product.item.ProductItemManager;

/**
 * @Author zhaozenghao
 * @Date 2022/5/9
 * @Description
 */
public class RequestProcessManager implements IProductModuleApi {
    private static final String TAG = RequestProcessManager.class.getSimpleName();

    @Override
    public double inquireProductOriginPrice(String productId) {
        return getProductOriginPrice(productId);
    }

    private double getProductOriginPrice(String productId) {
        return ProductItemManager.getInstance().getProductInfo(productId).getProductPriceOrigin();
    }
}
