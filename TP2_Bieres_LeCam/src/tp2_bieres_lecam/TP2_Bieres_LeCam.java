/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_lecam;

/**
 *
 * @author 33604
 */
public class TP2_Bieres_LeCam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere();
        uneBiere.Nom = "Cuvée des trolls";
        uneBiere.degreAlcool = (float) 7.0;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.lireEtiquette();
        BouteilleBiere deuxiemeBiere = new BouteilleBiere();
        deuxiemeBiere.Nom = "Leffe";
        deuxiemeBiere.degreAlcool = (float) 6.6;
        deuxiemeBiere.brasserie = "Abbaye de Leffe";
        deuxiemeBiere.lireEtiquette();
    }
}
