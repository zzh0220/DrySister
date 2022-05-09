package com.example.product.item;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ProductItem {
    private static final String TAG = ProductItem.class.getSimpleName();

    private final ReadWriteLock mRwLock = new ReentrantReadWriteLock();
    private final Lock mReadLock = mRwLock.readLock();
    private final Lock mWriteLock = mRwLock.writeLock();

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

    public int getCount() {
        mReadLock.lock();
        try {
            return mCount;
        } finally {
            mReadLock.unlock();
        }
    }

    public void setCount(int count) {
        mWriteLock.lock();
        try {
            this.mCount = count;
        } finally {
            mWriteLock.unlock();
        }
    }

    public String getProductName() {
        return mProductName;
    }

    public void setProductName(String productName) {
        this.mProductName = productName;
    }

    public double getProductPriceOrigin() {
        return mProductPriceOrigin;
    }

    public void setProductPriceOrigin(double productPriceOrigin) {
        this.mProductPriceOrigin = productPriceOrigin;
    }

    public double getProductPriceCurrent() {
        return mProductPriceCurrent;
    }

    public void setProductPriceCurrent(double productPriceCurrent) {
        this.mProductPriceCurrent = productPriceCurrent;
    }

    public String getProductDescribe() {
        return mProductDescribe;
    }

    public void setProductDescribe(String productDescribe) {
        this.mProductDescribe = productDescribe;
    }
}
