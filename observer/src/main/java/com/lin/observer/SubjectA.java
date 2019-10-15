package com.lin.observer;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月07日14:41
 */
public class SubjectA extends Subject {
    private boolean status;

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }
}
