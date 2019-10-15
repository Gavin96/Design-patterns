package com.lin.strategy;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月05日14:32
 */
public class NormalCash implements Cash {
    public double acceptCash(double price) {
        return price;
    }
}
