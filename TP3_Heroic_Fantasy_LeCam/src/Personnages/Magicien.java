/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Baton;

/**
 *
 * @author 33604
 */
public class Magicien extends Personnage {

    private boolean confirme;
    private String palier;
    
    public Magicien(String nom, int niveauDeVie, boolean confirme) {
        super(nom, niveauDeVie);
        this.confirme = confirme;
        this.palier = confirme ? "Confirmé" : "Novice";
    }

    public boolean isConfirme() {
        return confirme;
    }

    public String getPalier() {
        return palier;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
        this.palier = confirme ? "Confirmé" : "Novice";
    }

    @Override
    public String toString() {
        return super.toString() + ", Magicien{" + "confirme=" + confirme + ", palier=" + palier + '}';
    }

    public void equiperArme(Baton Chene) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

