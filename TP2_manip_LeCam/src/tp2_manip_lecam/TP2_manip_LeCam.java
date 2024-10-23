/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_lecam;

/**
 *
 * @author Le Cam Mael TDA
 */
public class TP2_manip_LeCam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création des tartiflettes
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

        // Référence croisée de assiette3 avec assiette2
        Tartiflette assiette3 = assiette2;

        // Affichage des calories
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        // Incrémentation des calories d'une assiette
        assiette2.nbCalories += 100;

        // Affichage après modification
        System.out.println("Après modification :");
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        // Inversion des objets référencés par assiette1 et assiette2
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        System.out.println("Après inversion :");
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);

        // Étape 6 : Création du tableau de 10 références de Moussaka
        Moussaka[] tableauMoussaka = new Moussaka[10];

        // Instanciation des 10 objets Moussaka
        for (int i = 0; i < 10; i++) {
            tableauMoussaka[i] = new Moussaka(300 + i * 100); // Exemple avec calories différentes
        }

        // Affichage des calories des Moussakas
        for (int i = 0; i < tableauMoussaka.length; i++) {
            System.out.println("Moussaka " + (i + 1) + " a " + tableauMoussaka[i].nbCalories + " calories.");
        }
    }
}
