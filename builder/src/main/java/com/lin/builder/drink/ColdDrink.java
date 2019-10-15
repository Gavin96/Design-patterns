package com.lin.builder.drink;

import com.lin.builder.pack.Bottle;
import com.lin.builder.Item;
import com.lin.builder.pack.Packing;

/**
 * @author longyang.lin
 * @description
 * @create 2018年11月28日18:37
 */
public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
