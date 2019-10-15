package com.lin.proxy;

/**
 * @author longyang.lin
 * @description 追求者
 * @create 2018年12月06日10:02
 */
public class Pursuer implements GiveGift {
    private Girl girl;

    public Pursuer(Girl girl) {
        this.girl = girl;
    }

    public void sentDolls() {
        System.out.println("送娃娃给" + girl.getName());
    }

    public void sendFlowers() {
        System.out.println("送花给" + girl.getName());
    }

    public void sendChocolate() {
        System.out.println("送巧克力给" + girl.getName());
    }
}
