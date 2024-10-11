/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseur_lecam;

/**
 *
 * @author 33604
 */
public class Convertisseur {

    int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    public static double CelciusVersKelvin(double tCelcius) {
        tCelcius = tCelcius + 273.15;
        return tCelcius;
    }

    public static double CelsiusVersFahrenheit(double tCelcius) {
        tCelcius = tCelcius * 33.8;
        return tCelcius;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        tKelvin = tKelvin - 273.15;
        return tKelvin;
    }

    public static double FahrenheitVersCelsius(double tFaren) {
        tFaren = tFaren / 33.8;
        return tFaren;
    }

    public static double KelvinVersFahrenheit(double tKelvin) {
        tKelvin = tKelvin / 255.93;
        return tKelvin;
    }

    public static double FahrenheitVersKelvin(double tFaren) {
        tFaren = tFaren * 255.93;
        return tFaren;
    }

    @Override
    public String toString() {
        return ("nb de conversions" + nbConversions);
    }
}
