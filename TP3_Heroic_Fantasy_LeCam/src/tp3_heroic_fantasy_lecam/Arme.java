/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lecam;

/**
 *
 * @author 33604
 */
public class Arme {
    private String nom;
    private int NiveauAttaque ;

    public Arme(String nom, int Attaque) {
        this.nom = nom;
        this.NiveauAttaque = NiveauAttaque;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", Attaque=" + NiveauAttaque + '}';
    }
}
