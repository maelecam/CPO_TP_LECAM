/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author 33604
 */
public class Guerrier extends Personnage {
    private boolean aCheval;
    private String deplacement;

    public Guerrier(String nom, int niveauDeVie, boolean aCheval) {
        super(nom, niveauDeVie);
        this.aCheval = aCheval;
        this.deplacement = aCheval ? "à cheval" : "à pied";
    }

    public boolean isACheval() {
        return aCheval;
    }

    public String getDeplacement() {
        return deplacement;
    }

    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
        this.deplacement = aCheval ? "à cheval" : "à pied";
    }

    @Override
    public String toString() {
        return super.toString() + ", Guerrier{" + "aCheval=" + aCheval + ", deplacement='" + deplacement + '\'' + '}';
    }
}
