package main.java.bean.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Yang on 2017/11/1.
 * 当前气候情况布告板
 * 当WeatherData有新的气候情况时 通知该布告板 显示最新的气候情况
 * 属于观察者，关注着WeatherData
 * 3使用系统内置的观察者接口(通过推的方式)
 */
public class CurrentConditionsDisplay3 implements Observer, DisplayElement {
    private float temperature;  //温度
    private float humidity;     //湿度
    private float pressure;     //气压

    private Observable observable;

    public CurrentConditionsDisplay3(Observable observable) {
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
        //先确定可观察者是WeatherData3，因为可能会同时观察多个对象
        if (obs instanceof WeatherData3) {
            //这里是可观察者主动推arg对象过来
            WeatherData3 weatherData3 = (WeatherData3) arg;
            this.temperature = weatherData3.getTemperature();
            this.humidity = weatherData3.getHumidity();
            this.pressure = weatherData3.getPressure();
            this.display();
        }

    }
}
