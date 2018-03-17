package main.java.service.ObserverPattern;

import main.java.bean.ObserverPattern.*;

/**
 * Created by Yang on 2017/11/1.
 */
public class WeatherStation2 {
    public static void main(String[] args) {
        WeatherData2 weatherData = new WeatherData2();
        CurrentConditionsDisplay2 currentConditionsDisplay = new CurrentConditionsDisplay2(weatherData);
        weatherData.setMeasurements(3.6f,7.2f,5.6f);
        weatherData.setMeasurements(4f,1.2f,3.6f);
    }
}
