package com.lin.builder.burger;

/**
 * @author longyang.lin
 * @description
 * @create 2018年11月28日18:38
 */
public class ChickenBurger extends Burger {
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
