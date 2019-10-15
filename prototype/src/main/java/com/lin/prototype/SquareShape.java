package com.lin.prototype;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月06日17:00
 */
public class SquareShape extends Shape {
    public SquareShape() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
