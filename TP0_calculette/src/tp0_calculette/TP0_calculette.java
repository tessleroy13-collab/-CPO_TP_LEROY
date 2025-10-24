/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;



/**
 *
 * @author tessl
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {System.out.println("1:add");
    System.out.println("2:substract ");
    System.out.println("3: multiply ");
    System.out.println("4:divide ");
    System.out.println("5:modulo");
     int operateur;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre :");  
        operateur=sc.nextInt();
        int operande1;
        System.out.println("Entrer le nombre :");  
        operande1=sc.nextInt();
        int operande2;
        System.out.println("Entrer le nombre :");  
        operande2=sc.nextInt();
        int result=0;
        switch (operateur) {
            case 1 -> result =operande1+operande2;
            case 2 -> result = operande1-operande2;
            case 3 -> result = operande1*operande2;
            case 4 -> {
                if (operande2==0){
                    System.out.println("Pas possible, SALE NUL");
                }
                else{
                    result= operande1/operande2;
                }
            }
            case 5 -> result=operande1%operande2;
            default -> System.out.println("valeur fausse!");
        }
        System.out.println("The result is :"+ result);
        // TODO code application logic here
    }
    
}
