package tp2_manip_lecam;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 33604
 */
public class Tartiflette {
    int nbCalories;

    // Constructeur pour initialiser le nombre de calories
    public Tartiflette(int calories) {
        nbCalories = calories;
    }
    @Override
    public String toString(){
        return "Tartiflette avec " + nbCalories + " calories.";
    }
}
