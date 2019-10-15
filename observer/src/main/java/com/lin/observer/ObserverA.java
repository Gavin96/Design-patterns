package com.lin.observer;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月07日14:40
 */
public class ObserverA implements Observer {
    private String name;
    private SubjectA subjectA;

    public ObserverA(SubjectA subjectA, String name) {
        this.subjectA = subjectA;
        this.name = name;
    }

    public void update() {
        System.out.println(name + ":收到通知==>" + subjectA.getStatus());
    }


}
