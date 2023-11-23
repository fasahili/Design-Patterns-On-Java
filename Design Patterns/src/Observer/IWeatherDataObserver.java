package Observer;

public interface IWeatherDataObserver {
    void update(float temperature, float humidity, float pressure);
}
