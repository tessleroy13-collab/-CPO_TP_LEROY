/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_leroy;

import java.util.Scanner;

/**
 *
 * @author tessl
 */
public class TP1_convertisseur_LEROY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9 / 5) + 32;
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) * 5 / 9;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
    }

    // ---- Programme principal ----
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bonjour, saisissez une valeur de température : ");
        double valeur = sc.nextDouble();

        System.out.println("\nChoisissez la conversion à effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Celcius vers Farenheit");
        System.out.println("4) De Farenheit vers Celcius");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
        System.out.print("Votre choix : ");

        int choix = sc.nextInt();
        double resultat = 0;
        String uniteDepart = "";
        String uniteArrivee = "";

        switch (choix) {
            case 1:
                resultat = CelciusVersKelvin(valeur);
                uniteDepart = "degré(s) Celcius";
                uniteArrivee = "degré(s) Kelvin";
                break;
            case 2:
                resultat = KelvinVersCelcius(valeur);
                uniteDepart = "degré(s) Kelvin";
                uniteArrivee = "degré(s) Celcius";
                break;
            case 3:
                resultat = CelciusVersFarenheit(valeur);
                uniteDepart = "degré(s) Celcius";
                uniteArrivee = "degré(s) Farenheit";
                break;
            case 4:
                resultat = FarenheitVersCelcius(valeur);
                uniteDepart = "degré(s) Farenheit";
                uniteArrivee = "degré(s) Celcius";
                break;
            case 5:
                resultat = KelvinVersFarenheit(valeur);
                uniteDepart = "degré(s) Kelvin";
                uniteArrivee = "degré(s) Farenheit";
                break;
            case 6:
                resultat = FarenheitVersKelvin(valeur);
                uniteDepart = "degré(s) Farenheit";
                uniteArrivee = "degré(s) Kelvin";
                break;
            default:
                System.out.println("Choix invalide !");
                sc.close();
                return;
        }

        System.out.printf("\n%.2f %s est égal à %.2f %s.\n", valeur, uniteDepart, resultat, uniteArrivee);
        sc.close();
    }
}
        // TODO code application logic here
    
    

