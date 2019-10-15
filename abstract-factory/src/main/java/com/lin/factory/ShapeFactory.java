package com.lin.factory;

import com.lin.color.Color;
import com.lin.shape.Circle;
import com.lin.shape.Rectangle;
import com.lin.shape.Shape;
import com.lin.shape.Square;

/**
 * @author longyang.lin
 * @description
 * @create 2018年11月26日16:54
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if ("CIRCLE".equalsIgnoreCase(shape)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(shape)) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
