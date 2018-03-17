package main.java.bean.CommandPattern;

/**
 * Created by Yang on 2017/12/9.
 * 打开电灯的命令
 */
public class LightOnCommand implements Command {
    Light light;    //接收者

    //将接收者绑定在命令对象中
    public LightOnCommand(Light light) {
        this.light = light;
    }

    //命令对象提供一个方法，调用这个方法将会 调用接收者的相关动作
    @Override
    public void execute() {
        light.on();     //动作(可以多个)
    }

    @Override
    public void undo() {
        light.off();
    }
}
