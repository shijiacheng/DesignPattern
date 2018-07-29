package com.shijc.dp.factorymethod;

import com.shijc.dp.simplefactory.Operation;

/**
 * 构建一个工厂接口
 */
public interface IFactory {
    Operation createOpeation();
}
