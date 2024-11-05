/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseur_lecam;

import java.util.Scanner;

/**
 *
 * @author 33604
 */

public class TP2_Convertisseur_LeCam {

    public static void main(String[] args) {
        Convertisseur convertisseur1 = new Convertisseur();
        Scanner sc = new Scanner(System.in);
        int continuer = 1;

        while (continuer == 1) {
            // Demande de saisie d'un nombre à convertir
            System.out.println("Veuillez saisir un nombre :");
            double valeur1 = sc.nextDouble();
            double sauvegarde = valeur1; // Stocker la valeur initiale pour l'affichage

            int saisie;
            do {
                // Menu de sélection de la conversion à effectuer
                System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
                System.out.println("1) De Celsius vers Kelvin");
                System.out.println("2) De Celsius vers Fahrenheit");
                System.out.println("3) De Kelvin vers Celsius");
                System.out.println("4) De Fahrenheit vers Celsius");
                System.out.println("5) De Kelvin vers Fahrenheit");
                System.out.println("6) De Fahrenheit vers Kelvin");
                System.out.println("Pour quitter le programme, saisir 0");

                saisie = sc.nextInt();

                if (saisie < 0 || saisie > 6) {
                    System.out.println("Saisie invalide. Veuillez choisir un nombre entre 0 et 6.");
                }

            } while (saisie < 1 || saisie > 6); // S'assurer que l'utilisateur entre une valeur valide

            // Gestion des conversions en fonction du choix de l'utilisateur
            switch (saisie) {
                case 1:
                    valeur1 = convertisseur1.CelciusVersKelvin(valeur1);
                    System.out.println(sauvegarde + " degrés Celsius est égal à " + valeur1 + " degrés Kelvin");
                    break;
                case 2:
                    valeur1 = convertisseur1.CelciusVersFarenheit(valeur1);
                    System.out.println(sauvegarde + " degrés Celsius est égal à " + valeur1 + " degrés Fahrenheit");
                    break;
                case 3:
                    valeur1 = convertisseur1.KelvinVersCelcius(valeur1);
                    System.out.println(sauvegarde + " degrés Kelvin est égal à " + valeur1 + " degrés Celsius");
                    break;
                case 4:
                    valeur1 = convertisseur1.FarenheitVersCelcius(valeur1);
                    System.out.println(sauvegarde + " degrés Fahrenheit est égal à " + valeur1 + " degrés Celsius");
                    break;
                case 5:
                    valeur1 = convertisseur1.KelvinVersFahrenheit(valeur1);
                    System.out.println(sauvegarde + " degrés Kelvin est égal à " + valeur1 + " degrés Fahrenheit");
                    break;
                case 6:
                    valeur1 = convertisseur1.FahrenheitVersKelvin(valeur1);
                    System.out.println(sauvegarde + " degrés Fahrenheit est égal à " + valeur1 + " degrés Kelvin");
                    break;
                case 0:
                    System.out.println("Fin du programme.");
                    return;
            }

            // Affiche le compteur de conversions
            System.out.println("Nombre de conversions : " + convertisseur1);

            // Demande si l'utilisateur veut effectuer une autre conversion
            System.out.println("Souhaitez-vous effectuer une nouvelle conversion ? (Oui = 1 / Non = 0)");
            continuer = sc.nextInt();
        }

        sc.close();
        System.out.println("Merci d'avoir utilisé le convertisseur !");
    }
}
