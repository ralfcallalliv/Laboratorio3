/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Lenovo
 */
public class MobileWarrior extends Character{

    public MobileWarrior(String name) {
        super(name,"Mobile");
    }

    @Override
    public void attack() {
        System.out.println(name + "ataca");  
    }
    
}
