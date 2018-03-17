package main.java.bean.CommandPattern;

/**
 * Created by Yang on 2017/12/9.
 */
public class GarageDoor {
    public void up(){
        System.out.println("开车库门");
    }
    public void down(){
        System.out.println("关车库门");
    }
    public void stop(){
        System.out.println("停止");
    }
    public void lightOn(){
        System.out.println("打开车库灯");
    }
    public void lightOff(){
        System.out.println("关闭车库灯");
    }
}
