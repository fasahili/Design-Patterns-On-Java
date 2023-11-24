#  :beginner: Weather Monitoring System
####  This system monitors weather and displays weather data and the customizations requested by the user.

## :ledger: Observer Pattern

##### WeatherDataSubject
- Objective: Stores real-time weather data such as temperature and humidity.
- Functionality: Alerts registered observers when there's an alteration in the stored weather data.

##### WeatherDataObserver
- Objective: Acts as an interface defining the update method for receiving weather data.
- Functionality: Concrete observer classes implement this interface to receive and exhibit weather updates.

##### CurrentConditionsDisplay
- Objective: Instantly exhibits prevailing weather conditions upon notification.
- Functionality: Displays real-time metrics like temperature, humidity, and pressure.

##### StatisticsDisplay
- Objective: Presents statistical insights derived from weather data.
- Functionality: Displays averages of temperature, humidity, and pressure over specific periods.

## :zap: Decorator Pattern

##### TemperatureUnitsDecorator
- Objective: Enables users to toggle between Celsius and Fahrenheit for displayed data.
- Functionality: Alters displayed temperature units based on user preferences.

##### WindSpeedDecorator
- Objective: Supplements weather data by adding wind speed details.
- Functionality: Enhances the weather display with additional information about wind speed.

##### PrecipitationDecorator
- Objective: Enriches weather data by incorporating details about precipitation.
- Functionality: Adds information about precipitation (rain, snow, etc.) to the displayed weather data.

##### Decorator Abstract Class
- Objective: Forms the foundation for concrete decorators.
- Functionality: Implements the IWeatherDataObserver interface, necessitating concrete decorators to define the update method.

##### DecoratorSwitch Abstract Class
- Objective: Manages the logic for switching between Celsius and Fahrenheit temperature units.
- Functionality: Defines the structure to handle the transition between temperature units based on specified user preferences.

## :notebook: Notes
- I have adhered to all the Design pattern(Opserver and Decrator) rules required.
- It took the temperature value out of the update to change its real value and convert it into other units.

##  :camera: UML
![Blank diagram](https://github.com/fasahili/Design-Patterns/assets/144853596/3cdff271-4d6e-4204-a6a3-d2cf20a445fe)
