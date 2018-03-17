package main.java.bean.CommandPattern;

/**
 * Created by Yang on 2017/12/26.
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        //不再只是执行一个动作，而是执行多个动作
        stereo.on();
        stereo.setCd();
        stereo.setVolume(20);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
