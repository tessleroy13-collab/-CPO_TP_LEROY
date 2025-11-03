/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_leroy;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tessl
 */
public class TP1_stats_LEROY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { Scanner sc = new Scanner(System.in);
        Random generateur = new Random();

      
        int[] faces = new int[6]; // Toutes les cases sont à 0 par défaut

      
        System.out.print("Combien de fois voulez-vous lancer le dé ? ");
        int m = sc.nextInt();


        for (int i = 0; i < m; i++) {
            int resultat = generateur.nextInt(6); // aléatoire entre 0 et 5
            faces[resultat]++; // incrémente la case correspondante
        }

   
        System.out.println("\nRésultats des lancers :");
        for (int i = 0; i < faces.length; i++) {
            System.out.println("Face " + (i + 1) + " : " + faces[i] + " fois");
        }

       
        System.out.println("\nRésultats en pourcentages :");
        for (int i = 0; i < faces.length; i++) {
            double pourcentage = (faces[i] * 100.0) / m;
            System.out.printf("Face %d : %.2f %%\n", (i + 1), pourcentage);
        }

        sc.close();
        // TODO code application logic here
    }
    
}
