package main.java.bean.CommandPattern;

/**
 * Created by Yang on 2017/12/26.
 * 遥控器有7个 开/关 按钮 每个按钮执行不同的命令 ，如 厕所灯开/关，车库灯 开/关
 */
public class UndoRemoteControl {
    Command[] onCommands;    //“开” 动作的命令集合
    Command[] offCommands;
    Command undoCommand;    //前一个命令记录在这里

    public UndoRemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = new NoCommand();    //这样就不需要检测每个插槽有没有设置命令了
            offCommands[i] = new NoCommand();
        }
        undoCommand = new NoCommand();  //一开始并没有 前一个命令
    }

    //将命令绑定到遥控器的具体位置上
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    //根据坐标执行对应的“开” 按钮
    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    //撤销命令 回到最近一个命令执行前的状态
    public void undoButtonWasPressed(){
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("\n ------Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot " + i + "]" + onCommands[i].getClass().getName() + "     " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuilder.toString();
    }

}
