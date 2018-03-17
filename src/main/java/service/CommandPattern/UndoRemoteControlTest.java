package main.java.service.CommandPattern;

import main.java.bean.CommandPattern.*;

/**
 * Created by Yang on 2017/12/9.
 * 测试撤销按钮
 * 命令、接收者（包含执行的动作）、调用者
 */
public class UndoRemoteControlTest {
    public static void main(String[] args) {
        UndoRemoteControl undoRemoteControl = new UndoRemoteControl();
        CeilingFan ceilingFan = new CeilingFan("房间的吊扇");
        Command ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        undoRemoteControl.setCommand(0,ceilingFanHighCommand,ceilingFanOffCommand);
        undoRemoteControl.setCommand(1,ceilingFanLowCommand,ceilingFanOffCommand);

        undoRemoteControl.onButtonWasPressed(0);    //吊扇高速
        undoRemoteControl.offButtonWasPressed(0);   //吊扇关闭
        System.out.println(undoRemoteControl);
        undoRemoteControl.undoButtonWasPressed();   //撤销 ，应该回到 吊扇高速
        undoRemoteControl.onButtonWasPressed(1);    //吊扇低速
        System.out.println(undoRemoteControl);
        undoRemoteControl.undoButtonWasPressed();   //撤销 ，应该回到 吊扇高速
    }
}
