/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Lenovo
 */
public class PCFactory extends GameElementFactory {

    @Override
    public Character CreateWarrior() {
        return new PCWarrior("Caballero de PC");
    }

    @Override
    public Weapon CreateWeapon() {
       return new PCSword("Espada del PC");
    }

  
    
}
