package com.lin;

import com.lin.facade.ShapeFacade;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月07日13:32
 */
public class Client {
    public static void main(String[] args) {
        ShapeFacade facade = new ShapeFacade();
        facade.drawShape();
    }
}
