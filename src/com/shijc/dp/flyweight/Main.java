package com.shijc.dp.flyweight;

public class Main {
    public static void main(String[] args){
        WebSiteFactory f = new WebSiteFactory();

        WebSite fx = f.getWebSiteCategory("产品展示");
        fx.Use(new User("小菜"));

        WebSite fy = f.getWebSiteCategory("产品展示");
        fy.Use(new User("大鸟"));

        WebSite fz = f.getWebSiteCategory("产品展示");
        fz.Use(new User("娇娇"));

        WebSite fl = f.getWebSiteCategory("博客");
        fl.Use(new User("老顽童"));

        WebSite fm = f.getWebSiteCategory("博客");
        fm.Use(new User("桃谷六仙"));

        WebSite fn = f.getWebSiteCategory("博客");
        fn.Use(new User("南海鳄神"));

        System.out.println("得到网站分类总数为"+f.getWebSiteCount());
    }
}
