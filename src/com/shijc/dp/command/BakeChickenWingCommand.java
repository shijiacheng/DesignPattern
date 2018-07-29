package com.shijc.dp.command;

/**
 * 具体命令-烤鸡翅命令
 */
public class BakeChickenWingCommand extends BarbecuerCommand {
    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void ExcuteCommand() {
        receiver.BakeChickenWing();
    }
}
