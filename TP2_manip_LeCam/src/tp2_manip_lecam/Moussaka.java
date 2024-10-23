package tp2_manip_lecam;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 33604
 */
public class Moussaka {

    int nbCalories;

    // Constructeur pour initialiser le nombre de calories
    public Moussaka(int calories) {
        nbCalories = calories;
        Moussaka[] tableauMoussaka = new Moussaka[10];
        for (int i = 0; i < 10; i++) {
            tableauMoussaka[i] = new Moussaka(300 + i * 100); // Exemple: chaque Moussaka a des calories différentes
        }
        // Affichage des calories des Moussakas
        for (int i = 0; i < tableauMoussaka.length; i++) {
            System.out.println("Moussaka " + (i + 1) + " a " + tableauMoussaka[i].nbCalories + " calories.");
        }

    }

    @Override
    public String toString() {
        return "Tartiflette avec " + nbCalories + " calories.";
    }
}
