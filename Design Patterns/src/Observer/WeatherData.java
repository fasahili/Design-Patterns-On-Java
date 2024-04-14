package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements IWeatherDataSubject {
    private float temperature;
    private float humidity;
    private float pressure;
    private final List<IWeatherDataObserver> observers = new ArrayList<>();
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
    public void subscribe(IWeatherDataObserver observer) {
        observers.add(observer);
    }
    public void unSubscribe(IWeatherDataObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (IWeatherDataObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
