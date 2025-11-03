/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_leroy;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tessl
 */
public class TP1_guessMyNumber_LEROY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        System.out.println("=== Bienvenue dans le jeu 'Guess My Number' ===");

        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1) Facile (0 à 50, illimité)");
        System.out.println("2) Normal (0 à 100, illimité)");
        System.out.println("3) Difficile (0 à 100, 10 essais max)");
        System.out.print("Votre choix : ");
        int niveau = sc.nextInt();

        int borneMax = 100;
        int nbEssaisMax = Integer.MAX_VALUE; // par défaut illimité

        if (niveau == 1) {
            borneMax = 50;
        } else if (niveau == 3) {
            nbEssaisMax = 10;
        }

        int nombreMystere = generateurAleat.nextInt(borneMax + 1);

        int tentative = 0;
        int saisie = -1;

        System.out.println("\nJ'ai choisi un nombre entre 0 et " + borneMax + " !");
        System.out.println("Essayez de le deviner !");

        while (saisie != nombreMystere && tentative < nbEssaisMax) {
            System.out.print("\nEntrez un nombre : ");
            saisie = sc.nextInt();
            tentative++;

            boolean mentir = generateurAleat.nextInt(100) < 30;

            if (saisie < nombreMystere) {
                if (mentir) {
                    System.out.println("Trop grand !");
                } else {
                    if (Math.abs(saisie - nombreMystere) > 30)
                        System.out.println("Vraiment trop petit !");
                    else
                        System.out.println("Trop petit !");
                }
            } else if (saisie > nombreMystere) {
                if (mentir) {
                    System.out.println("Trop petit !");
                } else {
                    if (Math.abs(saisie - nombreMystere) > 30)
                        System.out.println("Vraiment trop grand !");
                    else
                        System.out.println("Trop grand !");
                }
            } else {
                System.out.println("\n🎉 Bravo ! Vous avez trouvé le nombre mystère en " + tentative + " essais !");
                break;
            }

            if (tentative == nbEssaisMax && saisie != nombreMystere) {
                System.out.println("\n💀 Vous avez épuisé vos " + nbEssaisMax + " tentatives !");
                System.out.println("Le nombre mystère était : " + nombreMystere);
                break;
            }
        }

        System.out.println("\n=== Fin du jeu ===");
        sc.close();
      
    }
    
}
