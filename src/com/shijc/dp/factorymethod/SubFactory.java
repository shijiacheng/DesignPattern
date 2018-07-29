package com.shijc.dp.factorymethod;

import com.shijc.dp.simplefactory.Operation;
import com.shijc.dp.simplefactory.OperationSub;

/**
 * 减法类工厂
 */
public class SubFactory implements IFactory{
    @Override
    public Operation createOpeation() {
        return new OperationSub();
    }
}
