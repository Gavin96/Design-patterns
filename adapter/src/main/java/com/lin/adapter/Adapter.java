package com.lin.adapter;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月07日18:11
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void adapterGet() {
        adaptee.get();
    }

    public void adapterRemove() {
        adaptee.remove();
    }
}
