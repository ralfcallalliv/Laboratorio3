/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Lenovo
 */
public class PCWarrior extends Character {

    public PCWarrior(String name) {
        super(name, "PC");
    }
    @Override
    public void attack() {
         System.out.println(name + " ataca!");
    }

    
}
