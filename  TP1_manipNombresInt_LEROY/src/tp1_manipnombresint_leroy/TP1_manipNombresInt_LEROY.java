/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_leroy;

import java.util.Scanner;

/**
 *
 * @author tessl
 */
public class TP1_manipNombresInt_LEROY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Entrez le premier entier : ");
        int a = sc.nextInt();
        
        System.out.print("Entrez le second entier : ");
        int b = sc.nextInt();
        
        
        System.out.println("Vous avez saisi : " + a + " et " + b);
        
  
        System.out.println("Somme : " + (a + b));
        System.out.println("Différence : " + (a - b));
        System.out.println("Produit : " + (a * b));
        
      
        System.out.println("Quotient entier : " + (a / b));
        System.out.println("Reste de la division euclidienne : " + (a % b));

        System.out.println("Quotient exact : " + ((double) a / b));
        }
    }
}
        
    
  

