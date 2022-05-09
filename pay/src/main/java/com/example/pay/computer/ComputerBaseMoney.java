package com.example.pay.computer;

import com.example.common.moduleInterface.IProductModuleApi;
import com.example.common.moduleInterface.RegisterInterface;

/**
 * @Author zhaozenghao
 * @Date 2022/5/9
 * @Description
 */
public class ComputerBaseMoney {
    private static final String TAG = ComputerBaseMoney.class.getSimpleName();
    private IProductModuleApi IProductInterface = new RegisterInterface().getIProductModuleApi();

    public double computerBaseMoney(String productId) {
        return inquireProductOriginPrice(productId);
    }

    // 通过接口调用Product模块的方法
    private double inquireProductOriginPrice(String productId) {
        return IProductInterface.inquireProductOriginPrice(productId);
    }
}
