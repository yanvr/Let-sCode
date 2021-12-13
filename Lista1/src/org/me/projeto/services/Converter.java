package org.me.projeto.services;

public class Converter {

    public static float celsiusToFahrenheit(float celsius) {
        return (celsius * 1.8f) + 32;
    }

    public static float realToDolar(float reais, float dolarExchageRate) {
        return reais / dolarExchageRate;
    }

    public static float inchToCentimeter(float inch) {
        return (float) (inch * 2.54);
    }
}
