package com.lin;

import com.lin.template.AbstractClass;
import com.lin.template.ConcreteClass1;
import com.lin.template.ConcreteClass2;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月07日11:10
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass a = new ConcreteClass1();
        a.templateMethod();

        System.out.println("=============================");

        AbstractClass b = new ConcreteClass2();
        b.templateMethod();
    }
}
