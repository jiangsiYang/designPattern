package main.java.bean.ObserverPattern;

/**
 * Created by Yang on 2017/11/1.
 * 统计气候情况布告板
 * 当WeatherData有新的气候情况时 通知该布告板 显示统计的气候情况
 * 属于观察者，关注着WeatherData
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;  //温度
    private float humidity;     //湿度
    private float pressure;     //气压

    private Subject subject;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }

    @Override
    public void display() {
        if (temperature > humidity) {
            System.out.println("当前气候统计结果为温度大于湿度");
        }else {
            System.out.println("当前气候统计结果为湿度大于温度");
        }
    }
}
