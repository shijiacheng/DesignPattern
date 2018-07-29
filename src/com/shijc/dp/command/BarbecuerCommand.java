package com.shijc.dp.command;

/**
 * 抽象命令类
 */
public abstract class BarbecuerCommand {
    protected Barbecuer receiver;
    public BarbecuerCommand(Barbecuer receiver){
        this.receiver =receiver;
    }

    public abstract void ExcuteCommand();
}
