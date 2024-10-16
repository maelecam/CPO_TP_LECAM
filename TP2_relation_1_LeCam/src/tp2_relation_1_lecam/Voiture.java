/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_lecam;

/**
 *
 * @author 33604
 */
public class Voiture {
    String Modele;
    String Marque;
    int PussanceCV;

    public Voiture(String Modele, String Marque, int PussanceCV) {
        this.Modele = Modele;
        this.Marque = Marque;
        this.PussanceCV = PussanceCV;
    }

    @Override
    public String toString() {
        return "Voiture{" + "Modele=" + Modele + ", Marque=" + Marque + ", PussanceCV=" + PussanceCV + '}';
    }
    
}
