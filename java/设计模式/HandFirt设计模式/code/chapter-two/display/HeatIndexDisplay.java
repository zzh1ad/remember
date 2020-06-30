package display;

import java.util.Observable;
import java.util.Observer;

import subject.WeatherData;

/**
 * 酷热指数布告板
 */
public class HeatIndexDisplay implements DisplayElement, Observer{

    Observable observable;
    private float temp;
    private float humidity;
    private float heatindex;

    public HeatIndexDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temp = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.heatindex = computeHeatIndex(temp, humidity);
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("---------HeatIndexDisplay---------");
        System.out.println("温度:"+temp+"湿度:"+humidity+"酷热指数:"+heatindex);
    }

    /**
     * 酷热指数公式
     * @param t
     * @param rh
     * @return
     */
    private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
            (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
            (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
            (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *  
            (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
            (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +     
            0.000000000843296 * (t * t * rh * rh * rh)) -
            (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }
    
}