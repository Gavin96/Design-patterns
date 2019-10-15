package com.lin.builder.burger;

import com.lin.builder.Item;
import com.lin.builder.pack.Packing;
import com.lin.builder.pack.Wrapper;

/**
 * @author longyang.lin
 * @description
 * @create 2018年11月28日18:36
 */
public abstract class Burger implements Item {
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
