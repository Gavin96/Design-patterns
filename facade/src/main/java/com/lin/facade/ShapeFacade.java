package com.lin.facade;

import com.lin.entity.Circle;
import com.lin.entity.Rectangle;
import com.lin.entity.Square;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月07日13:57
 */
public class ShapeFacade {
    private Circle circle;
    private Rectangle rectangle;
    private Square square;


    public ShapeFacade() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawShape() {
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
