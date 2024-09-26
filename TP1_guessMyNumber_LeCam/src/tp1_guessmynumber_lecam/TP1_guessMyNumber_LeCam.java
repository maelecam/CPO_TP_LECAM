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
        int valeur1;
        System.out.println("Saisissez le niveau de difficulté :");
        System.out.println("1) Facile");
        System.out.println("2) Normal");
        System.out.println("3) Difficile");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Veillez saisir un nombre :");
        saisie = sc1.nextInt();
        switch (valeur1){
            case 1 : valeur1= Facile(valeur1); 
            case 2 : valeur1 = Normal(valeur1);
            case 3 : valeur1 = Difficile(valeur1);   
    }
    public static void Facile(String[] args) {
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
    public static void Difficile(String[] args) {
      Random generateurAleat = new Random();  
      int n = generateurAleat.nextInt(100);
      int valeur;
      Scanner sc = new Scanner(System.in);
      System.out.println("Veillez saisir un nombre compris entre 0 et 100 :");
      valeur = sc.nextInt();
      int compteur;
      compteur = 20;
      while ( n != valeur){
        compteur = compteur - 1;
        System.out.println("Nombre tentatives :" +compteur);
        if (compteur == 0){
            break;
        }
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
        public static void Normal(String[] args) {
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
