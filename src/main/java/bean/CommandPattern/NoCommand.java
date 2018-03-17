package main.java.bean.CommandPattern;

/**
 * Created by Yang on 2017/12/26.
 * 当遥控器插槽没有设置命令时，默认就是该类（这样就不用每次都检查某个插槽是否加载了命令，否则报null异常）
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {
    }
}
