package com.lin.decorartor;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月05日17:42
 */
public class ShapeDecorator implements ShapeComponent {
    protected ShapeComponent component;

    public ShapeDecorator(ShapeComponent component) {
        this.component = component;
    }

    public void draw() {
        component.draw();
    }
}
