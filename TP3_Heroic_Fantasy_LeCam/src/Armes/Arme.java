/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author 33604
 */
public class Arme {
    private String nom;
    private double NiveauAttaque ;

    public Arme(String nom, double Attaque) {
        this.nom = nom;
        this.NiveauAttaque = NiveauAttaque;
        if (NiveauAttaque <= 100){
            this.NiveauAttaque = NiveauAttaque ;
        } else {
            this.NiveauAttaque = 100 ;
        }
    }
    public String AvoirNom(){
        return this.nom;
    }
    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", Attaque=" + NiveauAttaque + '}';
    }

    Arme elementAt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
