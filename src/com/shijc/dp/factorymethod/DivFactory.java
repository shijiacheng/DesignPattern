package com.shijc.dp.factorymethod;

import com.shijc.dp.simplefactory.Operation;
import com.shijc.dp.simplefactory.OperationDiv;

/**
 * 除法类工厂
 */
public class DivFactory implements IFactory{
    @Override
    public Operation createOpeation() {
        return new OperationDiv();
    }
}
