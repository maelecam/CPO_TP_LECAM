/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_lecam;

import java.util.Random;
import java.util.Scanner;

/**
 * 23/09/2024
 *
 * @author Mael Le Cam TDA
 */
public class TP1_guessMyNumber_LeCam {

    /**
     * @param args the command line arguments
     */
    public class DevineLeNombre {
        public static void main(String[] args) {
            // Choisir le niveau de difficulté
            System.out.println("Choisissez votre niveau de difficulté (1 pour facile, 2 pour normal, 3 pour difficile) :");
            int niveauDeDifficulte = lireEntier();

            // Définir les paramètres en fonction du niveau
            int nombreMinimal, nombreMaximal, nombreEssaisMax;
            switch (niveauDeDifficulte) {
                case 1: // Niveau facile
                    nombreMinimal = 1;
                    nombreMaximal = 10;
                    nombreEssaisMax = 5;
                    break;
                case 2: // Niveau normal
                    nombreMinimal = 1;
                    nombreMaximal = 100;
                    nombreEssaisMax = 10;
                    break;
                case 3: // Niveau difficile
                    nombreMinimal = 1;
                    nombreMaximal = 1000;
                    nombreEssaisMax = 15;
                    break;
                default: // Niveau par défaut si l'entrée est invalide
                    System.out.println("Niveau invalide. Niveau normal choisi par défaut.");
                    nombreMinimal = 1;
                    nombreMaximal = 100;
                    nombreEssaisMax = 10;
                    break;
            }

            // Générer un nombre aléatoire entre nombreMinimal et nombreMaximal
            long tempsActuel = System.currentTimeMillis();
            int nombreMystere = (int) (tempsActuel % (nombreMaximal - nombreMinimal + 1)) + nombreMinimal;

            // Boucle de jeu
            int essais = 0;
            int proposition;
            do {
                System.out.print("Propose un nombre entre " + nombreMinimal + " et " + nombreMaximal + " : ");
                proposition = lireEntier();
                essais++;

                if (proposition < nombreMystere) {
                    System.out.println("C'est plus !");
                } else if (proposition > nombreMystere) {
                    System.out.println("C'est moins !");
                } else {
                    System.out.println("Félicitations ! Tu as trouvé le nombre en " + essais + " essais.");
                }
            } while (proposition != nombreMystere && essais < nombreEssaisMax);

            if (proposition != nombreMystere) {
                System.out.println("Dommage, tu n'as pas trouvé. Le nombre mystère était : " + nombreMystere);
            }
        }

        // Méthode pour lire un entier depuis la console
        private static int lireEntier() {
            try {
                return Integer.parseInt(System.console().readLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre entier.");
                return lireEntier();
            }
        }
    }
}
