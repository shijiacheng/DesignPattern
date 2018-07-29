package com.shijc.dp.state;

/**
 * 工作类
 */
public class Work {
    private WorkState current;
    public Work(){
        //工作初始化为上午工作状态，即上午9点开始上班
        current = new ForenoonState();
    }
    // 钟点属性，状态转换的依据
    private double hour;
    // 任务完成属性
    private boolean finish;

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void setState(WorkState state){
        current = state;
    }

    public void WriteProgram(){
        current.WriteProgram(this);
    }
}
