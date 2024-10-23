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
    
    public double CelciusVersKelvin(double tCelcius) {
        tCelcius = tCelcius + 273.15;
        return tCelcius;
    }

    public double CelciusVersFarenheit(double tCelcius) {
        tCelcius = tCelcius * 33.8;
        
        return tCelcius;
    }

    public double KelvinVersCelcius(double tKelvin) {
        tKelvin = tKelvin - 273.15;
        return tKelvin;
    }

    public double FarenheitVersCelcius(double tFaren) {
        tFaren = tFaren / 33.8;
        return tFaren;
    }

    public double KelvinVersFahrenheit(double tKelvin) {
        tKelvin = tKelvin / 255.93;
        return tKelvin;
    }

    public double FahrenheitVersKelvin(double tFaren) {
        tFaren = tFaren * 255.93;
        return tFaren;
    }

    @Override
    public String toString() {
        nbConversions = nbConversions + 1;
        return (""+ nbConversions);
    }
}
