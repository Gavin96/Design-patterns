package com.lin.template;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月07日11:18
 */
public abstract class AbstractClass {

    /**
     * 封装通用方法
     */
    public void templateMethod() {
        this.operation1();
        this.operation2();
    }

    /**
     * 抽象方法，给子类实现
     */
    public abstract void operation1();

    public abstract void operation2();
}
