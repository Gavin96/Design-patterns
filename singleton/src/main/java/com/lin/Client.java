package com.lin;

import com.lin.singleton.HungryModel;
import com.lin.singleton.LazyModel;

/**
 * @author longyang.lin
 * @description
 * @create 2018年11月26日14:03
 */
public class Client {
    public static void main(String[] args) {
        //饿汉式获取实例测试
        HungryModel hungryModel1 = HungryModel.getInstance();
        HungryModel hungryModel2 = HungryModel.getInstance();
        System.out.println("饿汉式获取结果==比较结果:" + (hungryModel1 == hungryModel2));

        //懒汉式获取实例测试
        LazyModel lazyModel1 = LazyModel.getInstance();
        LazyModel lazyModel2 = LazyModel.getInstance();
        System.out.println("懒汉式获取结果==比较结果:" + (lazyModel1 == lazyModel2));
    }
}
