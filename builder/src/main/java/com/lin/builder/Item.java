package com.lin.builder;

import com.lin.builder.pack.Packing;

/**
 * @author longyang.lin
 * @description
 * @create 2018年11月28日18:32
 */
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
