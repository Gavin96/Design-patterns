package com.lin;

import com.lin.state.Work;

/**
 * @author longyang.lin
 * @description
 * @create 2018年12月07日16:03
 */
public class Client {
    public static void main(String[] args) {
        Work work1 = new Work();
        work1.setHour(10);
        work1.writeProgram();

        Work work2 = new Work();
        work2.setHour(15);
        work2.writeProgram();

        Work work3 = new Work();
        work3.setHour(23);
        work3.writeProgram();
    }
}
