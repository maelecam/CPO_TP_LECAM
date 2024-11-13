/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lecam;

/**
 *
 * @author 33604
 */
public class Magicien extends Personnage {
    private boolean confirme;
    private String palier;

    // Constructeur avec nom, niveau de vie et les autres attributs spécifiques au Magicien
    public Magicien(boolean confirme,String palier, String nom, String NiveauDeVie) {
        super(nom, NiveauDeVie);
        if (NiveauDeVie < 20) {
            this.confirme = false;
            this.palier = "Novice";
        } else if (NiveaudeVie >= 20 && niveau < 50) {
            this.confirme = false;
            this.palier = "Moyen";
        } else {
            this.confirme = true;
            this.palier = "Confirme";
        }
    }
    public boolean isconfirme() {
        return confirme;
    }

    public int getniveau() {
        return niveau;
    }

    public void setconfirme(boolean confirme) {
        this.confirme = confirme;
    }

    public void setniveau(int niveau) {
        this.niveau = niveau;
        // Mettre à jour `confirme` et `palier` en fonction du nouveau niveau
        if (niveau < 20) {
            this.confirme = false;
            this.palier = "Novice";
        } else if (niveau >= 20 || niveau < 50) {
            this.confirme = false;
            this.palier = "Moyen";
        } else {
            this.confirme = true;
            this.palier = "Confirme";
        }
    }

    @Override
    public String toString() {
        return "Magicien{" + "Palier=" + palier + '}';
    }

}
