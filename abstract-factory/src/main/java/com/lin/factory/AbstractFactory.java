package com.lin.factory;

import com.lin.color.Color;
import com.lin.shape.Shape;

/**
 * @author longyang.lin
 * @description
 * @create 2018年11月26日16:42
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);
}
