package com.shijc.dp.command;

/**
 * 具体命令-烤羊肉串命令
 */
public class BakeMuttonCommand extends BarbecuerCommand {
    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void ExcuteCommand() {
        receiver.BakeMutton();
    }
}
