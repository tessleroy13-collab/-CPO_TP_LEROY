/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_leroy;

import Personnages.personnage;
import Personnages.magicien;
import Personnages.guerrier;
import Armes.Arme;
import Armes.Epee;
import Armes.Baton;
import java.util.ArrayList;


/**
 *
 * @author tessl
 */
public class TP3_Heroic_Fantasy_LEROY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ACTIVITÉ 1 : ARMES 
    Epee excalibur = new Epee("Excalibur", 7, 5);
    Epee durandal = new Epee("Durandal", 4, 7);

    Baton chene = new Baton("Chêne", 4, 5);
    Baton charme = new Baton("Charme", 5, 6);

    ArrayList<Arme> armes = new ArrayList<>();

    armes.add(excalibur);
    armes.add(durandal);
    armes.add(chene);
    armes.add(charme);

    System.out.println("Liste des armes :");
    for (int i = 0; i < armes.size(); i++) {
        System.out.println(armes.get(i));
    }


    //  ACTIVITÉ 2 : PERSONNAGES 
    magicien gandalf = new magicien("Gandalf", 65, true);
    magicien garcimore = new magicien("Garcimore", 44, false);

    guerrier conan = new guerrier("Conan", 78, false);
    guerrier lannister = new guerrier("Lannister", 45, true);

    ArrayList<personnage> personnages = new ArrayList<>();

    personnages.add(gandalf);
    personnages.add(garcimore);
    personnages.add(conan);
    personnages.add(lannister);

    System.out.println("\nListe des personnages :");
    for (int i = 0; i < personnages.size(); i++) {
        System.out.println(personnages.get(i));
    }
    }
}

    
