package com.shijc.dp.factorymethod;

import com.shijc.dp.simplefactory.Operation;
import com.shijc.dp.simplefactory.OperationAdd;

/**
 * 加法类工厂
 */
public class AddFactory implements IFactory{
    @Override
    public Operation createOpeation() {
        return new OperationAdd();
    }
}
