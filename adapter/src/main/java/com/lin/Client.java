package com.lin;

import com.lin.adapter.Adaptee;
import com.lin.adapter.Adapter;
import com.lin.adapter.Target;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月07日17:47
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.adapterGet();
        target.adapterRemove();
    }
}
