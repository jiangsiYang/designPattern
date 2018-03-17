package main.java.service.ObserverPattern;

import main.java.bean.ObserverPattern.CurrentConditionsDisplay2;
import main.java.bean.ObserverPattern.CurrentConditionsDisplay3;
import main.java.bean.ObserverPattern.WeatherData2;
import main.java.bean.ObserverPattern.WeatherData3;

/**
 * Created by Yang on 2017/11/1.
 */
public class WeatherStation3 {
    public static void main(String[] args) {
        WeatherData3 weatherData = new WeatherData3();
        CurrentConditionsDisplay3 currentConditionsDisplay = new CurrentConditionsDisplay3(weatherData);
        weatherData.setMeasurements(3.6f,7.2f,5.6f);
        weatherData.setMeasurements(4f,1.2f,3.6f);
    }
}
