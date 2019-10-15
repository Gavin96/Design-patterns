package com.lin.singleton;

/**
 * @author longyang.lin
 * @description
 * @create 2018年11月26日14:13
 */
public class LazyModel {

    private volatile static LazyModel lazyModel;

    /**
     * 私有化构造函数，防止对象被实例化修改
     */
    private LazyModel() {

    }

    /**
     * 对外提供获取对象方法
     *
     * @return
     */
    public static LazyModel getInstance() {
        if (lazyModel == null) {
            synchronized (LazyModel.class) {
                if (lazyModel == null) {
                    lazyModel = new LazyModel();
                }
            }
        }
        return lazyModel;
    }
}

