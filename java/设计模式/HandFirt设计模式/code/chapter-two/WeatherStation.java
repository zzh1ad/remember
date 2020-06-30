import display.CurrentConditionsDisplay;
import display.HeatIndexDisplay;
import subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionsDisplay(weatherData);
        new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(77, 14, 71.3f);
        weatherData.notifyObservers();

        System.out.println("温度发生了改变");
        weatherData.setMeasurements(91, 77, 21.4f);
        weatherData.notifyObservers();
    }
    
}