package main.java.bean.CommandPattern;

/**
 * Created by Yang on 2017/12/9.
 * 遥控器 调用者
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){}

    //将命令对象与调用者绑定在一起
    public void setCommand(Command command){
        this.slot = command;
    }
    //调用者执行 命令对象
    public void buttonWasPressed(){
        slot.execute();     //命令 执行请求的动作
    }
}
