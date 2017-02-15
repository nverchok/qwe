package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t) {
        super(t);
    }
    public String toString() {
        return getValue() + " C";
    }

    public Temperature toFahrenheit() {
        return new Fahrenheit(getValue()*9/5+32);
    }

    public Temperature toCelsius() {
        return this;
    }
}
