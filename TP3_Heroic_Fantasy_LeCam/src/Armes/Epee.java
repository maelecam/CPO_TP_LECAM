/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author 33604
 */
public class Epee extends Arme {
    private double finesse;

    public Epee(String nom, int Attaque, int finesse) {
        super(nom, Attaque);
        this.finesse = finesse;
        if (finesse < 100){
            this.finesse = finesse ;
        } else {
            this.finesse = 99;
        }
    }
    public double finesseEpee(){
        return finesse;
    }
    @Override
    public String toString() {
        return super.toString()+ ", Finesse : " + finesse;
    }
    
}
