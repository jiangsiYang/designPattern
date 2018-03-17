package main.java.bean.ObserverPattern;

/**
 * Created by Yang on 2017/11/1.
 * 预测气候情况布告板
 * 当WeatherData有新的气候情况时 通知该布告板 显示预测最新气候情况
 * 属于观察者，关注着WeatherData
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;  //温度
    private float humidity;     //湿度
    private float pressure;     //气压

    private Subject subject;

    public ForecastDisplay(Subject subject) {
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
        System.out.println("未来预测温度是" + (this.temperature + 2.3f) + "");
        System.out.println("未来预测湿度是" + (this.temperature + 9.4f) + "");
        System.out.println("未来预测气压是" + (this.temperature + 0.6f) + "");
    }
}
