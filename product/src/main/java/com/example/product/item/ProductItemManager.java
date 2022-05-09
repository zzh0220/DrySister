package com.example.product.item;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhaozenghao
 * @Date 2022/5/9
 * @Description
 */
public class ProductItemManager {
    private static final String TAG = ProductItemManager.class.getSimpleName();

    private static ProductItemManager mInstance;

    // 暂时用map保存
    private Map<String, ProductItem> mProductMap = new HashMap<>();

    public static ProductItemManager getInstance() {
        if (mInstance == null) {
            synchronized (ProductItemManager.class) {
                if (mInstance == null) {
                    mInstance = new ProductItemManager();
                }
            }
        }
        return mInstance;
    }

    public void addProduct(ProductItem productItem) {
        mProductMap.put(productItem.getProductId(), productItem);
    }

    public ProductItem getProductInfo(String productId) {
        return mProductMap.get(productId);
    }
}
