package apps.plop.piggy.temperatureconverter;

/**
 * Created by erice on 8/10/2015.
 */
public class ConvertUtil {

    public static float convertFahrenheitToCelsius(float fahrenheit)
    {
        return ((fahrenheit - 32) * 5 / 9);
    }

    public static float convertCelsiusToFahrenheit(float celsius)
    {
        return ((celsius * 9) / 5) + 32;
    }
}
