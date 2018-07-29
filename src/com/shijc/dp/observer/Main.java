package com.shijc.dp.observer;

public class Main {
    public static void main(String[] args){
        //老板胡汉三
        Boss huhansan  = new Boss();
        // 看股票的同事
        StockObserver tongshi1 = new StockObserver("股票精",huhansan);
        // 看NBA的同事
        NBAObserver tongshi2 = new NBAObserver("球球",huhansan);

        huhansan.Attach(tongshi1);
        huhansan.Attach(tongshi2);

        // 股票精没有被老板通知到，所以减去
        huhansan.Detach(tongshi2);
        // 老板状态修改
        huhansan.setSubjectState("我胡汉三回来了,");
        // 发出通知
        huhansan.Notify();
    }
}
