package com.lin;

import com.lin.decorartor.Circle;
import com.lin.decorartor.RedShapeDecorator;
import com.lin.decorartor.ShapeComponent;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月05日16:35
 */
public class Client {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        System.out.println("````````````````````````````````````");
        ShapeComponent component = new RedShapeDecorator(new Circle());
        component.draw();
    }
}
