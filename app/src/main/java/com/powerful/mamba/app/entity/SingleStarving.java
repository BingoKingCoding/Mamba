package com.powerful.mamba.app.entity;

/**
 * <单例模式 饿汉式>
 * Created by WangWB on 2020/3/1 22:48.
 * Email:634051075@qq.com
 */
public class SingleStarving {

    private SingleStarving() {

    }

    //缺点 不调用也会生成一个对象在内存中
    private static final SingleStarving sInstance = new SingleStarving();

    public static SingleStarving getInstance() {
        return sInstance;
    }


}
