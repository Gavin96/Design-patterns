package com.lin;

import com.lin.strategy.*;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月05日14:43
 */
public class Client {
    public static void main(String[] args) {
        Cash cash1 = new NormalCash();
        CashContext context1 = new CashContext(cash1);
        System.out.println(context1.getResult(100d));

        Cash cash2 = new RebateCash(0.8d);
        CashContext context2 = new CashContext(cash2);
        System.out.println(context2.getResult(100d));


        Cash cash3 = new ReturnCash(30d, 20d);
        CashContext context3 = new CashContext(cash3);
        System.out.println(context3.getResult(100d));
    }
}
