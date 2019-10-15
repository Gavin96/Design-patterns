package com.lin;

import com.lin.prototype.CircleShape;
import com.lin.prototype.Shape;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月06日15:01
 */
public class Client {
    public static void main(String[] args) {
        Shape circle = new CircleShape();
        circle.setId("1");
        System.out.println("originalId:" + circle.getId() + " ====== originalType:" + circle.getType());

        Shape cloneCircle = (Shape) circle.clone();
        System.out.println("cloneId:" + cloneCircle.getId() + " ====== cloneType:" + cloneCircle.getType());
    }


}
