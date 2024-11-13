/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lecam;

/**
 *
 * @author 33604
 */
public class Guerrier extends Personnage {
    private boolean Acheval;
    private String deplacement ;
   
    public Guerrier(boolean Acheval, String deplacement ,int vitesse, String nom, String NiveauDeVie) {
        super(nom, NiveauDeVie);
        if (Acheval = true){
            this.deplacement = "à cheval";
        } else {
            this.deplacement = "à pied";
        }
    }
    public boolean Acheval(){
        return Acheval;
    }
    public String deplacemement(){
        return deplacement;
    }
    public void setAcheval(boolean Acheval){
        this.Acheval = Acheval;
    }

    @Override
    public String toString() {
        return "Guerrier{" + "Acheval=" + Acheval + '}';
    }   
}
