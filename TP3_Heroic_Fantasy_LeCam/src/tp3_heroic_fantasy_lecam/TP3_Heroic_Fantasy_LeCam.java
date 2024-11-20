/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_lecam;

import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author 33604
 */
public class TP3_Heroic_Fantasy_LeCam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création de deux épees
        Epee Excalibur = new Epee("Excalibur", 7, 5);
        Epee Durandal = new Epee("Durandal", 4, 7);
        Epee CrimsonTempest = new Epee("CrimsonTempest", 8, 7);
        // création de deux batons
        Baton Chene = new Baton("Chêne", 4, 5);
        Baton Charme = new Baton("Charme", 5, 6);
        Baton EdgeOfTaixuan = new Baton("EdgeOfTaixuan", 8, 7);
        ArrayList<Arme> Equipement = new ArrayList<Arme>();
        Equipement.add(Excalibur);
        Equipement.add(Durandal);
        Equipement.add(Chene);
        Equipement.add(Charme);
        System.out.println(Equipement);
        System.out.println(Equipement.size());
        
        Magicien Gandalf = new Magicien("Gandalf", 65,true);
        Magicien Garcimore = new Magicien("Garcimore", 44, true);
        Guerrier Conan = new Guerrier("Conan", 78, false);
        Guerrier Lannister = new Guerrier("Lannister", 45, true);
        ArrayList<Personnage> Combattant = new ArrayList<Personnage>();
        Combattant.add(Gandalf);
        Combattant.add(Garcimore);
        Combattant.add(Lannister);
        Combattant.add(Conan);
        
        Gandalf.ajouterArme(Chene);
        Gandalf.ajouterArme(Excalibur);
        Gandalf.ajouterArme(CrimsonTempest);
        Gandalf.equiperArme(Chene);
        Conan.ajouterArme(Charme);
        Conan.ajouterArme(EdgeOfTaixuan);
        Conan.ajouterArme(Durandal);
        Conan.equiperArme(EdgeOfTaixuan);
        
        int nbArmesPreferes = Gandalf.getNombresArmesPreferees();
        System.out.println("Le Magicien"+ Gandalf.getNom() +"Possede" + nbArmesPreferes+"armes preferes");
        System.out.println("\n--- Caractéristiques des personnages ---");
        System.out.println(Conan.toString());
        System.out.println(Gandalf.toString());
        }  
    }
