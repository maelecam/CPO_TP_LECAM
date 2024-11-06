/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_lecam;

/**
 *
 * @author 33604
 */
public class TP2_relation_1_LeCam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles " + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);
        bob.liste_voitures[0] = uneClio;
        bob.liste_voitures[1] = une2008;
        bob.nbVoitures = 2;
        uneClio.proprietaire = bob;
        une2008.proprietaire = bob;
        System.out.println("la premiere voiture de bob est " + bob.liste_voitures[0]);
        System.out.print("la deuxieme voiture de bob est " + bob.liste_voitures[1]);
        reno.liste_voitures[0] = uneMicra;
        reno.liste_voitures[1] = uneAutreClio;
        uneMicra.proprietaire = reno;
        uneAutreClio.proprietaire = reno;
        System.out.println("la premiere voiture de reno est " + reno.liste_voitures[0]);
        System.out.print("la deuxieme voiture de reno est " + reno.liste_voitures[1]);
        // Essai d'ajouter une voiture
        System.out.println("Ajout de Clio par Bobby : " + bob.ajouter_voiture(uneClio)); // Doit réussir
        System.out.println("Ajout de Micra par Bobby : " + bob.ajouter_voiture(uneMicra)); // Doit réussir

        // Essai d'ajouter une voiture déjà possédée
        uneClio.proprietaire = bob; // Simule que la Clio a déjà un propriétaire
        System.out.println("Ajout de Clio par Bobby à nouveau : " + bob.ajouter_voiture(uneClio)); // Doit échouer
    }

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
