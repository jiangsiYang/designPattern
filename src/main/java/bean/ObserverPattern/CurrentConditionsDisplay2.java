package main.java.bean.ObserverPattern;

import java.util.*;
import java.util.Observer;

/**
 * Created by Yang on 2017/11/1.
 * 当前气候情况布告板
 * 当WeatherData有新的气候情况时 通知该布告板 显示最新的气候情况
 * 属于观察者，关注着WeatherData
 * 2使用系统内置的观察者接口(通过主动拉的方式)
 */
public class CurrentConditionsDisplay2 implements Observer, DisplayElement {
    private float temperature;  //温度
    private float humidity;     //湿度
    private float pressure;     //气压

    private Observable observable;

    public CurrentConditionsDisplay2(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);   //将本身登记成为观察者
    }

    @Override
    public void display() {
        System.out.println("当前温度是" + this.temperature + "");
        System.out.println("当前湿度是" + this.humidity + "");
        System.out.println("当前气压是" + this.pressure + "");
    }

    @Override
    public void update(Observable obs, Object arg) {
        //先确定可观察者是WeatherData2，因为可能会同时观察多个对象
        if (obs instanceof WeatherData2) {
            //这里就是通过可观察者提供的get方法主动去“拉”获取自己需要的数据啦
            WeatherData2 weatherData2 = (WeatherData2) obs;
            this.temperature = weatherData2.getTemperature();
            this.humidity = weatherData2.getHumidity();
            this.pressure = weatherData2.getPressure();
            this.display();
        }

    }
}
