/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lecam;

/**
 *
 * @author 33604
 */
public class Baton extends Arme{
    int age;
    if (age => 100){
        age = 0;
}
    public Baton( String nom, int Attaque, int age) {
        super(nom, Attaque);
        this.age = age;
    }
    @Override
    public String toString() {
        return "Baton{" + "age=" + age + '}';
    }
    
    
}
