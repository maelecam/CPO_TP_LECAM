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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
        BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe",6.6 ,"Abbaye de Leffe") ;
        BouteilleBiere troisiemeBiere = new BouteilleBiere("La 16", 8.0 , "Montpel");
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Hinano", 9.0, "Something");
        BouteilleBiere LAPLUSHORRIBLE = new BouteilleBiere("la heineken", 9.9, "J'sais pas");
    }
}
