package com.lin;

import com.lin.observer.ObserverA;
import com.lin.observer.ObserverB;
import com.lin.observer.SubjectA;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月07日14:31
 */
public class Client {
    public static void main(String[] args) {
        SubjectA subjectA = new SubjectA();

        ObserverA jia = new ObserverA(subjectA, "jia");
        ObserverB yi = new ObserverB(subjectA, "yi");
        subjectA.attach(jia);
        subjectA.attach(yi);

        subjectA.setStatus(false);
        subjectA.notifyObserver();

        System.out.println("==========================");

        subjectA.detach(jia);
        subjectA.setStatus(true);
        subjectA.notifyObserver();
    }
}
