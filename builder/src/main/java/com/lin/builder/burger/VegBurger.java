package com.lin.builder.burger;

/**
 * @author longyang.lin
 * @description
 * @create 2018年11月28日18:38
 */
public class VegBurger extends Burger {
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
