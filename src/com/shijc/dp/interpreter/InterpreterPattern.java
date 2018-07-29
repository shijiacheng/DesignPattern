package com.shijc.dp.interpreter;

import java.util.ArrayList;
import java.util.List;

public class InterpreterPattern {
    public static void main(String[] args){
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression expression : list) {
            expression.Interpret(context);
        }
    }
}

/**
 * AbstractExpression(抽象表达式),声明一个抽象的解释操作，这个接口为抽象语法树中所有的节点所共享
 */
abstract class AbstractExpression{
    public abstract void Interpret(Context context);
}

/**
 * TerminalExpression(终结符表达式)，实现与文法中的终结符相关联的解释操作。实现抽象表表达式中所要求的接口，主要是一个interpret()方法。文法中每一个终结符都有一个具体终结表达式与之相对应。
 *
 */
class TerminalExpression extends AbstractExpression{

    @Override
    public void Interpret(Context context) {
        System.out.println("终端解释器");
    }
}


/**
 * NonterminalExpression(非终结符表达式)，为文法中的非终结符实现解释器操作。对文法中每一条规则R1、R2……Rn都需要一个具体的非终结符表达式类。通过实现抽象表达式的interpret()方法实现解释操作。解释操作以递归方式调用上面所提到的代表R1、R2……Rn中各个符号的实例变量
 *
 */
class NonterminalExpression extends AbstractExpression{

    @Override
    public void Interpret(Context context) {
        System.out.println("非终端解释器");
    }
}

/**
 * Context，包含解释器之外的一些全局信息
 */
class Context {
    private String input;
    private String output;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
