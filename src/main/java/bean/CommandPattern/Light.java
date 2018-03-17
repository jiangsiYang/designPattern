package main.java.bean.CommandPattern;

/**
 * Created by Yang on 2017/12/9.
 * 接收者 receiver
 */
public class Light {
    public void on(){
        System.out.println("打开电灯");
    }
    public void off(){
        System.out.println("关灯");
    }
}
