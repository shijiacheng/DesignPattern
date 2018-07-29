package com.shijc.dp.state;

/**
 * 下午工作状态
 */
public class AfternoonState extends WorkState {
    @Override
    public void WriteProgram(Work w) {
        if (w.getHour()<17){
            System.out.println("当前时间："+ w.getHour()+"点 下午状态还不错，继续努力");
        }else {
            w.setState(new EveningState());
            w.WriteProgram();
        }

    }
}
