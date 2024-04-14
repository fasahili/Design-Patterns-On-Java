package Decorator;

import Observer.IWeatherDataObserver;

public class TemperatureUnitsDecorator extends DecoratorSwitch  {

    public TemperatureUnitsDecorator (IWeatherDataObserver decoratedObserver, boolean DoFahrenheit, boolean DoCelsius) {
        super(decoratedObserver,DoFahrenheit,DoCelsius);

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        if(!(DoCelsius&&DoFahrenheit)){
           checkInput(temperature,humidity,pressure);
        }else{
            System.out.println("Invalid Input");
        }

    }

    private void checkInput(float temperature, float humidity, float pressure) {
        if (DoFahrenheit) {
            decoratedObserver.update(temperature, humidity, pressure);
            System.out.println("[ Fahrenheit Temperature  = " + celsiusToFahrenheit(temperature) +"°F  ] ");
        } else if(DoCelsius){
            decoratedObserver.update(temperature, humidity, pressure);
            System.out.println("[ Celsius Temperature  = " + fahrenheitToCelsius(temperature) +"°C  ] ");
        }
    }

    private float celsiusToFahrenheit(float celsius) {
        return (celsius * 9 / 5) + 32;
    }
    private float fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
