package com.shijc.dp.state;
/**
 * 中午工作状态
 */
public class NoonState extends WorkState {
    @Override
    public void WriteProgram(Work w) {
        if (w.getHour()<13){
            System.out.println("当前时间："+ w.getHour()+"点 饿了，犯困，午休");
        }else {
            w.setState(new AfternoonState());
            w.WriteProgram();
        }

    }
}
