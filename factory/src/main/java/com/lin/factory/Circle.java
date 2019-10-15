package com.lin.factory;

import com.lin.factory.Shape;

/**
 * @author longyang.lin
 * @description
 * @create 2018年11月26日14:51
 */
public class Circle implements Shape {
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
