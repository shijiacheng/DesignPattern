package com.shijc.dp.state;
/**
 * 晚上工作状态
 */
public class EveningState extends WorkState {
    @Override
    public void WriteProgram(Work w) {
        if (w.isFinish()){
            w.setState(new RestState());
            w.WriteProgram();
        }else {
            if (w.getHour()<21){
                System.out.println("当前时间："+ w.getHour()+"点 加班哦，疲累至极");
            }else {
                w.setState(new SleepingState());
                w.WriteProgram();
            }
        }


    }
}
