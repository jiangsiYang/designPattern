package main.java.service.ObserverPattern;

import main.java.bean.ObserverPattern.CurrentConditionsDisplay;
import main.java.bean.ObserverPattern.ForecastDisplay;
import main.java.bean.ObserverPattern.StatisticsDisplay;
import main.java.bean.ObserverPattern.WeatherData;

/**
 * Created by Yang on 2017/11/1.
 */
public class WeatherStation {
    public static void main(String[] args) {
//        Subject weatherData = new WeatherData();  不能用Subject作静态类型 因为Subject没有setMeasurements方法，用Subject作静态类型 只能用Subject接口的方法
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
//        weatherData.registerObserver(currentConditionsDisplay);
//        weatherData.registerObserver(statisticsDisplay);
//        weatherData.registerObserver(forecastDisplay);
        weatherData.setMeasurements(3.6f,7.2f,5.6f);
        weatherData.setMeasurements(4f,1.2f,3.6f);
    }
}
