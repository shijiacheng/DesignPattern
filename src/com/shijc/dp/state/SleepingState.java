package com.shijc.dp.state;

/**
 * 睡眠工作状态
 */
public class SleepingState extends WorkState {
    @Override
    public void WriteProgram(Work w) {
        System.out.println("当前时间："+ w.getHour()+"点 不行了，睡着了");

    }
}
