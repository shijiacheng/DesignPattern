package com.shijc.dp.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类
 */
public class Waiter {
    private List<BarbecuerCommand> orders = new ArrayList<>();

    //设置订单
    public void setOrder(BarbecuerCommand command){
        if (command instanceof BakeChickenWingCommand){
            System.out.println("服务员：鸡翅没有了，请点其他的");
        }else {
            orders.add(command);
            System.out.println("增加订单：羊肉串");
        }
    }

    // 取消订单
    public void cancelOrder(BarbecuerCommand command){
        orders.remove(command);
    }

    // 通知全部执行
    public void Notify(){
        for (int i = 0; i < orders.size(); i++) {
            orders.get(i).ExcuteCommand();
        }
    }
}
