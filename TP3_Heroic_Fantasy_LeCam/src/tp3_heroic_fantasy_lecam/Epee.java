/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lecam;

/**
 *
 * @author 33604
 */
public class Epee extends Arme {

    int finesse;
    if (finesse  =  > 100){
    finesse = 0;
    }
    public Epee(String nom, int Attaque, int finesse) {
        super(nom, Attaque);
        this.finesse = finesse;
    }

    @Override
    public String toString() {
        return "Epee{" + "finesse=" + finesse + '}';
    }

}
