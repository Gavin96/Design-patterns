package com.lin.state;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月07日16:14
 */
public class MorningState implements State {
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("12点前上班精力充足");
        } else {
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
