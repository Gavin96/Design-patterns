package com.lin.builder.drink;

/**
 * @author longyang.lin
 * @description
 * @create 2018年11月28日18:39
 */
public class Coke extends ColdDrink {
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return  30.0f;
    }
}
