package com.lin.state;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月07日16:09
 */
public class Work {
    private State state;
    private double hour;
    private boolean finish;

    public Work() {
        //初始化转态
        state = new MorningState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void writeProgram() {
        this.state.writeProgram(this);
    }


    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean getFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
