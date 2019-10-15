package com.lin.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月07日14:35
 */
public abstract class Subject {
    private List<Observer> observerList = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
