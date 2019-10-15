package com.lin.builder.drink;

/**
 * @author longyang.lin
 * @description
 * @create 2018年11月28日18:40
 */
public class Pepsi extends ColdDrink {
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
