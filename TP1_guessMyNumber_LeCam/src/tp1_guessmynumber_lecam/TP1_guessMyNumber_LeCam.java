/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_lecam;

import java.util.Random;
import java.util.Scanner;

/**
 *23/09/2024
 * @author Mael Le Cam
 * TDA
 */
public class TP1_guessMyNumber_LeCam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saisie;
        System.out.println("Saisissez le niveau de difficulté :");
        System.out.println("1) Facile");
        System.out.println("2) Normal");
        System.out.println("3) Difficile");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Veillez saisir un nombre :");
        saisie = sc1.nextInt();
        switch (saisie){
            case 1 : saisie = Facile(n); 
            case 2 : saisie = CelciusVersFarenheit(valeur1);
            case 3 : saisie = KelvinVersCelcius(valeur1);   
    }
    public static void facile(String[] args) {
      Random generateurAleat = new Random();  
      int n = generateurAleat.nextInt(100);
      int valeur;
      Scanner sc = new Scanner(System.in);
      System.out.println("Veillez saisir un nombre compris entre 0 et 100 :");
      valeur = sc.nextInt();
      int compteur;
      compteur = 0;
      while ( n != valeur){
        compteur = compteur + 1;
        System.out.println("Nombre tentatives :"+compteur);
        if (valeur > n){
            System.out.println("trop grand");
            System.out.println("Veillez saisir un nombre compris entre 0 et 100 :");
            valeur = sc.nextInt();
            compteur = compteur + 1;
          } if ( valeur < n){
            System.out.println("Trop petit");
            System.out.println("Veillez saisir un nombre compris entre 0 et 100 :");
            valeur = sc.nextInt();
            } if (valeur == n){
                System.out.println("gagne");
            }
      } 
    }
    
}
