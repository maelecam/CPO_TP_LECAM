/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;
import java.util.ArrayList;

/**
 *
 * @author 33604
 */
public class Personnage {

    private String nom;
    private int niveauDeVie;
    private ArrayList<Arme> armes;
    private Arme armeEnMain = null;

    public Personnage(String nom, int niveauDeVie) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        this.armes = new ArrayList<>();
    }

    public int getNombreArmesPreferees() {
        int count = 0;
        for (Arme arme : this.getArmes()) {
            if (arme instanceof Baton) { // Vérifie si l'arme est un bâton
                count++;
            }
        }
        return count;
    }

    

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public String getNom() {
        return nom;
    }

    public Arme getArmeEnMain() {
        return armeEnMain;
    }

    public void ajouterArme(Arme arme) {
        if (armes.size() < 5) {
            armes.add(arme);
            System.out.println("L'arme " + arme.AvoirNom() + " a ete ajoutee à l'inventaire.");
        } else {
            System.out.println("L'inventaire est plein. Impossible d'ajouter l'arme " + arme.AvoirNom() + ".");
        }
    }

    public void equiperArme(String nomArme) {
        for (Arme arme : armes) {
            if (arme.AvoirNom().equals(nomArme)) {
                armeEnMain = arme;
                System.out.println("L'arme " + nomArme + " a été équipée.");
                return;
            }
        }
        System.out.println("L'arme " + nomArme + " n'est pas dans l'inventaire.");
    }

    @Override
    public String toString() {
        String armeDescription = (armeEnMain != null) ? armeEnMain.toString() : "Pas d'arme équipée";
        return "Personnage{" + "nom='" + nom + '\'' + ", niveauDeVie=" + niveauDeVie + ", armeEnMain=" + armeDescription + '}';
    }

    private Iterable<Arme> getArmes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
