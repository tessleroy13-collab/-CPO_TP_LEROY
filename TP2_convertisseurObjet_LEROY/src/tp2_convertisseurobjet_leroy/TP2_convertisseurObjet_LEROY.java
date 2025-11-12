/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_leroy;

/**
 *
 * @author tessl
 */
public class TP2_convertisseurObjet_LEROY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur conv1 = new Convertisseur();
        Convertisseur conv2 = new Convertisseur();

        double f = conv1.celsiusToFahrenheit(0);     // 0°C -> 32°F
        double k = conv1.celsiusToKelvin(25);        // 25°C -> 298.15K
        double c = conv2.fahrenheitToCelsius(212);   // 212°F -> 100°C
        double c2 = conv2.kelvinToCelsius(273.15);   // 273.15K -> 0°C

        System.out.println("0°C -> " + f + "°F");
        System.out.println("25°C -> " + k + "K");
        System.out.println("212°F -> " + c + "°C");
        System.out.println("273.15K -> " + c2 + "°C");

        System.out.println("\nÉtat des convertisseurs :");
        System.out.println("conv1 : " + conv1);
        System.out.println("conv2 : " + conv2);
    }
}

    
    

