package main.java.bean.ObserverPattern;

import java.util.ArrayList;

/**
 * Created by Yang on 2017/11/1.
 * 具体的 主题（可观察者）实现类
 * 通过实现自己写的可观察者接口
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observerList;

    private float temperature;  //温度
    private float humidity;     //湿度
    private float pressure;     //气压

    public WeatherData() {
        this.observerList = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observerList.indexOf(observer);
        if (i >= 0) {
            observerList.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature, humidity, pressure);
        }
    }

    //获得最新气候数据 后 通知 观察者
    public void measurementsChange(){
        this.notifyObservers();
    }

    //获得最新的 气候数据
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange();
    }
}
