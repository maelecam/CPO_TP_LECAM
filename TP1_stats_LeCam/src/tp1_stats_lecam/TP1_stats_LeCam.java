/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_lecam;

import java.util.Scanner;

/**
 * 23/09/2024
 *
 * @author Mael Le Cam TDA
 */
public class TP1_stats_LeCam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tab = new int[6];
        System.out.println("Initial dice frequencies:");
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Face " + (i + 1) + ": " + tab[i]);
        }

        // demander a l'utlisateur de saisir la frequence
        int m;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Saisissez le nombre de lancers (simulations) :");
        m = sc1.nextInt();

        // lancer de dé
        for (int i = 0; i < m; i++) {
            int result = (int) (Math.random() * 6);
            tab[result]++;
        }

        System.out.println("Resultat nombre de face obtenue apres simulation :");
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Face " + (i + 1) + ": " + tab[i]);
        }
    }
}
