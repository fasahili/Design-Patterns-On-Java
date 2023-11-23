package Decorator;

import Observer.IWeatherDataObserver;

public class WindSpeedDecorator extends Decorator {

    public WindSpeedDecorator(IWeatherDataObserver observer, float valueAdded) {
        super(observer, valueAdded);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        decoratedObserver.update(temperature, humidity, pressure);
        System.out.println("[ Wind speed =   " + valueAdded + "km/h ]");
        System.out.println();

    }
}
