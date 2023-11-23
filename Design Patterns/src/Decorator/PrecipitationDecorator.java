package Decorator;

import Observer.IWeatherDataObserver;

public class PrecipitationDecorator extends Decorator  {

    public PrecipitationDecorator(IWeatherDataObserver observer, float valueAdded) {
        super(observer, valueAdded);

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        decoratedObserver.update(temperature,humidity,pressure);
        System.out.println("Precipitation = [" + valueAdded + "% ]");
        System.out.println();

    }
}
