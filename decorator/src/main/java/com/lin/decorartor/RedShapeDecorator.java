package com.lin.decorartor;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月05日18:50
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(ShapeComponent component) {
        super(component);
    }

    @Override
    public void draw() {
        super.draw();
        this.setRedBorder();

    }

    private void setRedBorder() {
        System.out.println("Border Color: Red");
    }
}
