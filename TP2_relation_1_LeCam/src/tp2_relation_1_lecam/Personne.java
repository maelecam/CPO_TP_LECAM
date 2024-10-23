/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_lecam;

/**
 *
 * @author 33604
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture [] liste_voitures;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        liste_voitures = new Voiture [3];
        int nombreDeVoituresPossedees = 0;      
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
}
