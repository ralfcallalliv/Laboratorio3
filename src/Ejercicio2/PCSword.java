/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Lenovo
 */
public class PCSword extends Weapon {

    public PCSword(String name) {
        super(name,"PC");
    }

    @Override
    public void use() {
        System.out.println(name + "Utiliza arma");
    }
    
}
