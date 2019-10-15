package com.lin.strategy;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月05日14:35
 */
public class ReturnCash implements Cash {
    private double moneyCondition = 0d;
    private double moneyReturn = 0d;

    public ReturnCash(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    public double acceptCash(double price) {
        if (price > moneyCondition) {
            return price - Math.floor(price / moneyCondition) * moneyReturn;
        }
        return price;
    }
}
