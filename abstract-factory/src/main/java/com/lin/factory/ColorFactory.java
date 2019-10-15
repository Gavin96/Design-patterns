package com.lin.factory;

import com.lin.color.Blue;
import com.lin.color.Color;
import com.lin.color.Green;
import com.lin.color.Red;
import com.lin.shape.Shape;

/**
 * @author longyang.lin
 * @description
 * @create 2018年11月26日16:43
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if ("RED".equalsIgnoreCase(color)) {
            return new Red();
        } else if ("GREEN".equalsIgnoreCase(color)) {
            return new Green();
        } else if ("BLUE".equalsIgnoreCase(color)) {
            return new Blue();
        }
        return null;
    }
}
