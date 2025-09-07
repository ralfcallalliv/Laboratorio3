/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Lenovo
 */
public class MobileSword extends Weapon {

    public MobileSword(String name) {
        super(name,"Mobile");
    }

    @Override
    public void use() {
        System.out.println(name+"Usa la espada");
    }
    
}
