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
public class Baton extends Arme{
    private int age;
    public Baton( String nom, int Attaque, int age) {
        super(nom, Attaque);
        this.age = age;
        if (age < 100){
            this.age = age;
        } else {
            this.age = 99;
        }
    }
    public int AgeBaton(){
        return age;
    }
    @Override
    public String toString() {
        return super.toString() + ", Âge: " + age;
    }
    
    
}