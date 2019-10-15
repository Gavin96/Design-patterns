package com.lin.strategy;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月05日14:33
 */
public class RebateCash implements Cash {
    private double rebateCash = 1L;


    public RebateCash(double rebateCash) {
        this.rebateCash = rebateCash;
    }

    public double acceptCash(double price) {
        return price * rebateCash;
    }
}
