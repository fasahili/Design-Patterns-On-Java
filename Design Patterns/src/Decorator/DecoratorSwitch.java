package Decorator;

import Observer.IWeatherDataObserver;

public abstract class DecoratorSwitch implements IWeatherDataObserver {
    protected IWeatherDataObserver decoratedObserver;
    protected boolean DoFahrenheit;
    protected boolean DoCelsius;

    DecoratorSwitch (IWeatherDataObserver decoratedObserver, boolean DoFahrenheit, boolean DoCelsius){
        this.decoratedObserver=decoratedObserver;
        this.DoFahrenheit=DoFahrenheit;
        this.DoCelsius=DoCelsius;

    }
}
