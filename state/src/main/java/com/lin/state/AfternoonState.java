package com.lin.state;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月07日16:16
 */
public class AfternoonState implements State {
    public void writeProgram(Work work) {
        if (work.getHour() < 17 ) {
            System.out.println("下午上班，有点疲劳");
        } else {
            work.setState(new NightState());
            work.writeProgram();
        }
    }
}
