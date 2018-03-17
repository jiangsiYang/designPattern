package main.java.service.CommandPattern;

import main.java.bean.CommandPattern.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yang on 2017/12/9.
 * 命令模式
 * 命令、接收者（包含执行的动作）、调用者
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        //多个命令对象的调用者
        RemoteControl remoteControl = new RemoteControl();
        //接收者
        Light livingRoomLight = new Light();
        GarageDoor garageDoor1 = new GarageDoor();
        Stereo stereo = new Stereo();
        //命令(绑定接收者)
        Command onCommand = new LightOnCommand(livingRoomLight);
        Command offCommand = new LightOffCommand(livingRoomLight);
        Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor1);
        Command garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor1);
        Command stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        Command stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);
        //将各种命令绑定到调用者
        remoteControl.setCommand(0,onCommand,offCommand);
        remoteControl.setCommand(1,garageDoorOpenCommand,garageDoorCloseCommand);
        remoteControl.setCommand(2,stereoOnWithCDCommand,stereoOffWithCDCommand);

        System.out.println(remoteControl.toString());

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);

    }
}
