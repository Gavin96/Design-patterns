package com.lin.prototype;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月06日16:55
 */
public class CircleShape extends Shape {

    public CircleShape() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
