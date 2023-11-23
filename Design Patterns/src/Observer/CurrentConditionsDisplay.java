package Observer;

public class CurrentConditionsDisplay  implements IWeatherDataObserver {

    public void update(float temperature, float humidity, float pressure) {
        System.out.println();
        System.out.println(" The Measurements :- ");
        System.out.println("[ Temperature = " + temperature +" (°C | °F) ] ");
        System.out.println("[ Humidity = " + humidity + "% ]");
        System.out.println("[ Pressure =  " + pressure + "hPa ]");
    }


}
