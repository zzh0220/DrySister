package com.example.pay.computer;

import com.example.common.moduleInterface.IProductModuleApi;

/**
 * @Author zhaozenghao
 * @Date 2022/5/9
 * @Description
 */
public class ComputerBaseMoney {
    private static final String TAG = ComputerBaseMoney.class.getSimpleName();
    private IProductModuleApi IProductInterface;

    public double computerBaseMoney(String productId) {
        return inquireProductOriginPrice(productId);
    }

    // 通过接口调用Product模块的方法
    private double inquireProductOriginPrice(String productId) {
        return IProductInterface.inquireProductOriginPrice(productId);
    }
}
