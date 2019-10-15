package com.lin;

import com.lin.proxy.Girl;
import com.lin.proxy.GiveProxy;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月05日19:37
 */
public class Client {
    public static void main(String[] args) {
        Girl girl = new Girl("韩梅梅");
        GiveProxy proxy = new GiveProxy(girl);
        proxy.sentDolls();
        proxy.sendFlowers();
        proxy.sendChocolate();
    }
}
