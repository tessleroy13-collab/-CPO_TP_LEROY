/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_leroy;

/**
 *
 * @author tessl
 */
class Convertisseur { 
   int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    public double celsiusToFahrenheit(double c) {
        nbConversions++;
        return c * 9.0 / 5.0 + 32;
    }

    public double fahrenheitToCelsius(double f) {
        nbConversions++;
        return (f - 32) * 5.0 / 9.0;
    }

    public double celsiusToKelvin(double c) {
        nbConversions++;
        return c + 273.15;
    }

    public double kelvinToCelsius(double k) {
        nbConversions++;
        return k - 273.15;
    }

    @Override
    public String toString() {
        return "nb de conversions : " + nbConversions;
    }
}
    

