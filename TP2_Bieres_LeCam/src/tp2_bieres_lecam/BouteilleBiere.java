/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_lecam;

import java.io.Console;

/**
 *11/10/2024
 * @author Le Cam mael
 * TDA
 */
public class BouteilleBiere {

    String Nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    public void lireEtiquette() {
        System.out.println("Bouteille de " + Nom + " (" + degreAlcool + " degrés)\nBrasserie : " + brasserie + " et elle est : " + (ouverte ? "ouverte" : "fermée"));
    }

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie, boolean ouverte) {
        String nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    public boolean Décapsuler() {
        if (!ouverte) {
            ouverte = false;
            return true;
        } else {
            System.out.println("Erreur : bière déjà ouverte");
            return false;
        }
    }

    @Override
    public String toString() {
        String chaine_a_retourner;
        String nom = null;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte == true) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
    }
}

// finir etape 14 et 