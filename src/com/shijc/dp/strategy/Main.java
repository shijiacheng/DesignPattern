package com.shijc.dp.strategy;

public class Main {
    public static void main(String[] args){
        String type = "满300减100";
        CashContext cc = null;

        switch (type){
            case "正常收费":
                cc = new CashContext(new CashNormal());
                break;
            case "满300减100":
                cc = new CashContext(new CashReturn(300,100));
                break;
            case "打8折":
                cc = new CashContext(new CashRebate(0.8));
                break;
        }

        double resultPrice = cc.GetResult(520);
        System.out.println("最终的价格是："+resultPrice);
    }
}
