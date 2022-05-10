package com.example.common.moduleInterface;

import android.content.Context;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * @Author zhaozenghao
 * @Date 2022/5/10
 * @Description
 */
public interface IDegradeService extends IProvider {
    void onLost(Context context, Postcard postcard);
}
