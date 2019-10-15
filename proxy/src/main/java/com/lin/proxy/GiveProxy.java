package com.lin.proxy;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月06日10:02
 */
public class GiveProxy implements GiveGift {
    private Pursuer pursuer;

    public GiveProxy(Girl girl) {
        this.pursuer = new Pursuer(girl);
    }

    public void sentDolls() {
        pursuer.sentDolls();
    }

    public void sendFlowers() {
        pursuer.sendFlowers();
    }

    public void sendChocolate() {
        pursuer.sendChocolate();
    }
}
