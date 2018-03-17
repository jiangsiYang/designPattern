package main.java.bean.CommandPattern;

/**
 * Created by Yang on 2017/12/26.
 * 实现 撤销按钮
 * 吊扇不像电灯一样，开的撤销就是关，关的撤销就是开 这么简单
 * 需要记录状态 例如现在是3档，但上次的档位有可能是 2/1/0 ,
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("ceilingFan speed is high");
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
        System.out.println("ceilingFan speed is low");
    }

    public void off() {
        speed = OFF;
        System.out.println("ceilingFan speed is off");
    }

    public int getSpeed() {
        return this.speed;
    }
}
