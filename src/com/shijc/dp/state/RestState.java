package com.shijc.dp.state;
/**
 * 下班状态
 */
public class RestState extends WorkState {
    @Override
    public void WriteProgram(Work w) {
        System.out.println("当前时间："+ w.getHour()+"点 下班回家了");

    }
}
