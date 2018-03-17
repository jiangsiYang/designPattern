package main.java.service.CommandPattern;

import main.java.bean.CommandPattern.*;

/**
 * Created by Yang on 2017/12/9.
 * 宏命令（一键执行多个命令）
 * 命令、接收者（包含执行的动作）、调用者
 */
public class MacroRemoteControlTest {
    public static void main(String[] args) {
        //多个命令对象的调用者
        UndoRemoteControl remoteControl = new UndoRemoteControl();
        //接收者
        Light livingRoomLight = new Light();
        GarageDoor garageDoor1 = new GarageDoor();
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan("living room");

        Command onCommand = new LightOnCommand(livingRoomLight);
        Command offCommand = new LightOffCommand(livingRoomLight);
        Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor1);
        Command garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor1);
        Command stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        Command stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);
        Command ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        Command[] partyOn = {onCommand, garageDoorOpenCommand, stereoOnWithCDCommand,ceilingFanHighCommand};    //一键开启 电灯/车库门/放音乐
        Command[] partyOff = {offCommand, garageDoorCloseCommand, stereoOffWithCDCommand,ceilingFanOffCommand};     //一键关闭 电灯/车库门/放音乐

        MacroCommand partyOnMarco = new MacroCommand(partyOn);
        MacroCommand partyOffMarco = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMarco, partyOffMarco);

        remoteControl.onButtonWasPressed(0);    //一键开启
        remoteControl.offButtonWasPressed(0);   //一键关闭
        remoteControl.undoButtonWasPressed();   //撤销 ，又回到一键开启的状态

    }
}
