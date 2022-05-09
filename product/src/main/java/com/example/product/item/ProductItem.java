package com.example.product.item;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ProductItem {
    private static final String TAG = ProductItem.class.getSimpleName();

    private final ReadWriteLock mRwLock = new ReentrantReadWriteLock();
    private final Lock mReadLock = mRwLock.readLock();
    private final Lock mWriteLock = mRwLock.writeLock();

    // 商品的ID
    private String mProductId;
    // 商品的类别
    private String mProductCategory;
    // 商品名称
    private String mProductName;
    // 原价
    private double mProductPriceOrigin;
    // 现价
    private double mProductPriceCurrent;
    // 描述
    private String mProductDescribe;
    // 库存
    private int mCount;

    public String getProductId() {
        return mProductId;
    }

    public ProductItem setProductId(String productId) {
        this.mProductId = productId;
        return this;
    }

    public String getCategory() {
        return mProductCategory;
    }

    public ProductItem setCategory(String productCategory) {
        this.mProductCategory = productCategory;
        return this;
    }

    public int getCount() {
        mReadLock.lock();
        try {
            return mCount;
        } finally {
            mReadLock.unlock();
        }
    }

    public ProductItem setCount(int count) {
        mWriteLock.lock();
        try {
            this.mCount = count;
        } finally {
            mWriteLock.unlock();
        }
        return this;
    }

    public String getProductName() {
        return mProductName;
    }

    public ProductItem setProductName(String productName) {
        this.mProductName = productName;
        return this;
    }

    public double getProductPriceOrigin() {
        return mProductPriceOrigin;
    }

    public ProductItem setProductPriceOrigin(double productPriceOrigin) {
        this.mProductPriceOrigin = productPriceOrigin;
        return this;
    }

    public double getProductPriceCurrent() {
        return mProductPriceCurrent;
    }

    public ProductItem setProductPriceCurrent(double productPriceCurrent) {
        this.mProductPriceCurrent = productPriceCurrent;
        return this;
    }

    public String getProductDescribe() {
        return mProductDescribe;
    }

    public ProductItem setProductDescribe(String productDescribe) {
        this.mProductDescribe = productDescribe;
        return this;
    }
}
