/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_lecam;

import java.util.Scanner;

/**
 *23/09/2024
 * @Mael Le Cam
 * TDA
 */
public class TP1_manipNombresInt_LeCam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int entier1;
       Scanner sc = new Scanner(System.in);
       System.out.println("Veillez saisir un nombre :");
       entier1 = sc.nextInt();
       int entier2;
       Scanner sc1 = new Scanner(System.in);
       System.out.println("Veillez saisir un nombre :");
       entier2 = sc1.nextInt();
       int somme;
       somme = entier1 + entier2 ;
       System.out.println("Voici la somme des deux nombres : "+somme);
       int difference;
       difference = entier1 - entier2 ;
       System.out.println("Voici la somme des deux nombres : "+difference);
       int produit ;
       produit = entier1 * entier2 ;
       System.out.println("Voici la somme des deux nombres : "+produit);
       int quotient;
       int reste ;
       quotient = entier1 / entier2;
       reste = entier1 % entier2;
       System.out.println("Voici le quotient des deux nombres : "+quotient);
       System.out.println("et le reste de la division est : "+reste );
       
       
       
    }
    
}
