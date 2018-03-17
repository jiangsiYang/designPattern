package main.java.service.CommandPattern;

import main.java.bean.CommandPattern.*;

/**
 * Created by Yang on 2017/12/9.
 * 命令模式
 * 命令、接收者（包含执行的动作）、调用者
 */
public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        //简单的调用者
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();    //调用者
        Light light = new Light();  //接收者
        GarageDoor garageDoor = new GarageDoor();
        Command lightOnCommand = new LightOnCommand(light);     //将接收者绑定到命令中
        Command garaDoorCommand = new GarageDoorOpenCommand(garageDoor);
        simpleRemoteControl.setCommand(lightOnCommand);     //将命令绑定到调用者
        simpleRemoteControl.buttonWasPressed();   //调用者执行命令
        simpleRemoteControl.setCommand(garaDoorCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
