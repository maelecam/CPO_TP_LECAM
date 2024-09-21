/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 * 20/09/2024
 *
 * @author Mael Le Cam TDA Découverte programmation Java
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int erreur;
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Veillez rentrer un nombre inferieur a 1 ou superieur a 5 :");
        erreur = sc4.nextInt();
        if (erreur < 1 || erreur > 5) {
            System.out.println("La valeur n'est pas bonne ");
            System.out.println("Veuillez en rentrer une autre ");
        }
        System.out.println("1) ADD"
                + " 2) Substract"
                + " 3) Multiply"
                + " 4) divide"
                + " 5) modulo");
        int operateur;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veillez saisir un nombre pour definir l'operateur :");
        operateur = sc.nextInt();
        int operande1;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Veuiller saisir une premiere valeure :");
        operande1 = sc2.nextInt();
        int operande2;
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Veuiller saisir une deuxieme valeure :");
        operande2 = sc3.nextInt();
        if (operateur == 1) {
            int resultat;
            resultat = operande1 + operande2;
            System.out.println("Le resultat est " + resultat);
        }
        if (operateur == 2) {
            int resultat;
            resultat = operande1 - operande2;
            System.out.println("Le resultat est " + resultat);
        }
        if (operateur == 3) {
            int resultat;
            resultat = operande1 * operande2;
            System.out.println("Le resultat est " + resultat);
        }
        if (operateur == 4) {
            float resultat;
            resultat = operande1 / operande2;
            System.out.println("Le resultat est " + resultat);
        }
        if (operateur == 5) {
            float resultat;
            resultat = operande1 % operande2;
            System.out.println("Le resultat est " + resultat);
            }
    }
}
