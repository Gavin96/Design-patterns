package com.lin.singleton;

/**
 * @author longyang.lin
 * @description
 * @create 2018年11月26日14:06
 */
public class HungryModel {
    /**
     * 随着类加载而加载
     */
    private static HungryModel hungryModel = new HungryModel();

    /**
     * 私有化构造函数，防止对象被实例化修改
     */
    private HungryModel() {

    }

    /**
     * 对外提供获取对象方法
     *
     * @return
     */
    public static HungryModel getInstance() {
        return hungryModel;
    }
}
