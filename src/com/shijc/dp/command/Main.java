package com.shijc.dp.command;

public class Main {
    public static void main(String[] args){
        //开店前准备
        Barbecuer boy = new Barbecuer();
        BarbecuerCommand bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        BarbecuerCommand bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        BarbecuerCommand bakeChickenWingCommand = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();

        // 开门营业
        girl.setOrder(bakeMuttonCommand1);
        girl.setOrder(bakeMuttonCommand2);
        girl.setOrder(bakeChickenWingCommand);

        // 点菜完毕，通知厨房
        girl.Notify();
    }
}
