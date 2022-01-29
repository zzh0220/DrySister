package com.example.common.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.common.constant.ConstantString;

/**
 * 使用sqlite, 用于创建数据库
 */
public class DataBaseHelper extends SQLiteOpenHelper {
    private static final String TAG = DataBaseHelper.class.getSimpleName();

    public DataBaseHelper(@Nullable Context context, @Nullable String name,
                          @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    /**
     * 调用时刻：当数据库第1次创建时调用
     * 作用：创建数据库 表 & 初始化数据
     * SQLite数据库创建支持的数据类型： 整型数据、字符串类型、日期类型、二进制
     */
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createTbStr = "create table if not exists " + ConstantString.DA_LITE_TABLE_NAME
                + "( _id integer primary key, name varchar, account varchar, pwd varchar)";
        sqLiteDatabase.execSQL(createTbStr);
        // 注：数据库实际上是没被创建 / 打开的（因该方法还没调用）
        // 直到getWritableDatabase() / getReadableDatabase() 第一次被调用时才会进行创建 / 打开
    }

    /**
     * 调用时刻：当数据库升级时则自动调用（即 数据库版本 发生变化时）
     * 作用：更新数据库表结构
     * 注：创建SQLiteOpenHelper子类对象时,必须传入一个version参数，该参数 = 当前数据库版本, 若该版本高于之前版本, 就调用onUpgrade()
     */
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //可重新建表
        sqLiteDatabase.execSQL("drop table if exists " + ConstantString.DA_LITE_TABLE_NAME);
        onCreate(sqLiteDatabase);

        //也可在表中新增列元素， 使用 SQL的ALTER语句
        String sql = "alter table " + ConstantString.DA_LITE_TABLE_NAME + " add job varchar";
        sqLiteDatabase.execSQL(sql);
    }
}
