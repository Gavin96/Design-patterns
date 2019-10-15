package com.lin.strategy;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月05日14:39
 */
public class CashContext {
    private Cash cash;

    public CashContext(Cash cash) {
        this.cash = cash;
    }

    public double getResult(double price) {
        return cash.acceptCash(price);
    }
}
