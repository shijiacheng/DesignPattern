package com.shijc.dp.bridge;

/**
 * 手机品牌类
 */
public abstract class HandsetBrand {
    protected HandsetSoft soft;

    public void setSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    //运行
    public abstract void Run();
}
