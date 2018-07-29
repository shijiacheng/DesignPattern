package com.shijc.dp.factorymethod;

import com.shijc.dp.simplefactory.Operation;
import com.shijc.dp.simplefactory.OperationMul;

/**
 * 乘法类工厂
 */
public class MulFactory implements IFactory{
    @Override
    public Operation createOpeation() {
        return new OperationMul();
    }
}
