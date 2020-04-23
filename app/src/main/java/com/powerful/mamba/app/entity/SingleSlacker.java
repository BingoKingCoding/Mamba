package com.powerful.mamba.app.entity;

/**
 * <单例模式 懒汉式>
 * Created by WangWB on 2020/3/1 22:56.
 * Email:634051075@qq.com
 */
public class SingleSlacker {

    private volatile static SingleSlacker sInstance;

    private SingleSlacker(){}

    //缺点 每次调用都会同步一次，浪费资源
    public static SingleSlacker getInstance(){
        if (sInstance == null) {
            synchronized (SingleSlacker.class){
                if (sInstance==null){
                    sInstance = new SingleSlacker();
                }
            }
        }
        return sInstance;
    }

}
