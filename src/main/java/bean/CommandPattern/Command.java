package main.java.bean.CommandPattern;

/**
 * Created by Yang on 2017/12/9.
 * 所有命令 都需要实现命令接口
 */
public interface Command {
    public void execute();      //命令接口只需要实现一个方法,命令对象执行时要调用的方法
    public void undo();     //撤销命令
}
