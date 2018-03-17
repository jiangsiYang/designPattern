package main.java.bean.CommandPattern;

/**
 * Created by Yang on 2017/12/26.
 * 音响、立体声
 */
public class Stereo {
    public void on(){
        System.out.println("打开开关");
    }
    public void off(){
        System.out.println("关闭开关");
    }
    public void setCd(){
        System.out.println("放入CD");
    }
    public void setVolume(int volume){
        System.out.println("设置音量"+volume);
    }

}
