package com.shijc.dp.command;

public class CommandPattern {
    public static void main(String[] args){
        Receiver r = new Receiver();
        Command c = new ConcreteCommand(r);
        Invoker i = new Invoker();

        i.setCommand(c);
        i.excuteCommand();
    }
}

/**
 * Command类，用来声明执行操作的接口
 */
abstract class Command{
    protected  Receiver receiver;
    public Command(Receiver receiver){
        this.receiver = receiver;
    }

    public abstract void Execute();
}

/**
 * ConcreteCommand类，将一个接收者对象绑定与一个动作，调用接收者相应的操作，以实现Excute
 */
class ConcreteCommand extends Command{

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void Execute() {
        receiver.Action();
    }
}

/**
 * Invoker类，要求该命令执行这个请求
 */
class Invoker{
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void excuteCommand(){
        command.Execute();
    }
}

/**
 * Receiver类，知道如何实施与执行一个与请求相关的操作，任何类都可能作为一个接收者
 */
class Receiver{
    public void Action(){
        System.out.println("执行请求");
    }
}