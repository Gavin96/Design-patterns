package com.lin.state;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月07日16:20
 */
public class NightState implements State {
    public void writeProgram(Work work) {
        System.out.println("晚上不想上班了");
    }
}
