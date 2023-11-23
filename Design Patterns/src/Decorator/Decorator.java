package Decorator;

import Observer.IWeatherDataObserver;

public abstract class Decorator implements IWeatherDataObserver{

    protected IWeatherDataObserver decoratedObserver;
    protected float valueAdded;

    public Decorator(IWeatherDataObserver decoratedObserver, float valueAdded) {
        this.decoratedObserver = decoratedObserver;
        this.valueAdded = valueAdded;
    }
}
