package Observer;

public interface IWeatherDataSubject {
    void subscribe(IWeatherDataObserver observer);
    void unSubscribe(IWeatherDataObserver observer);
    void notifyObservers();
}
