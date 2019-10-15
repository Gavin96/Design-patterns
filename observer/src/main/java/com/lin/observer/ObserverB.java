package com.lin.observer;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月07日14:41
 */
public class ObserverB implements Observer {
    private String name;
    private SubjectA subjectA;

    public ObserverB(SubjectA subjectA, String name) {
        this.subjectA = subjectA;
        this.name = name;
    }

    public void update() {
        System.out.println(name + ":收到通知==>" + subjectA.getStatus());
    }
}
