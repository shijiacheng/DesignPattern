package com.shijc.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 网站工厂类
 */
public class WebSiteFactory {
    private Map<String,Object> flyweights = new HashMap<>();

    // 获得网站分类
    public WebSite getWebSiteCategory(String key){
        if (!flyweights.containsKey(key)){
            flyweights.put(key,new ConcreteWebSite(key));
        }
        return (WebSite) flyweights.get(key);
    }

    public int getWebSiteCount(){
        return flyweights.size();
    }
}
