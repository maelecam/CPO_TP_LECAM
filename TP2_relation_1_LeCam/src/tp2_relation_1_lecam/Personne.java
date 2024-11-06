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
    Voiture[] liste_voitures;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.liste_voitures = new Voiture[3];
        this.nbVoitures = 0;  // Initialise correctement le nombre de voitures possédées
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }

    // Méthode pour ajouter une voiture à la personne
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        // Vérifie si la voiture a déjà un propriétaire
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println("Erreur : La voiture " + voiture_a_ajouter.Modele + " appartient déjà à " + voiture_a_ajouter.proprietaire.prenom + ".");
            return false;
        }

        // Vérifie si le nombre de voitures possédées est inférieur à 3
        if (nbVoitures >= 3) {
            System.out.println("Erreur : " + prenom + " possède déjà 3 voitures. Ajout impossible.");
            return false;
        }

        // Ajout de la voiture dans le tableau liste_voitures
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;  // Incrémente le nombre de voitures possédées

        // Désigne cette personne comme propriétaire de la voiture
        voiture_a_ajouter.proprietaire = this;

        // Retourne true pour indiquer que l'ajout a réussi
        return true;
    }
}
