/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Lenovo
 */
public class MobileFactory extends GameElementFactory {

    @Override
    public Character CreateWarrior() {
        return new MobileWarrior("Picaro Móvil");
    }

    @Override
    public Weapon CreateWeapon() {
        return new MobileSword("Daga móvil");
    }
    
}
