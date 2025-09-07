/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Creando elementos para PC ---");
        GameElementFactory PCFactory = new PCFactory();
        Character pcWarrior =PCFactory.createWarrior();
        Weapon pcWeapon = PCFactory.createWeapon();
        pcWarrior.attack();
        pcWeapon.use();

        System.out.println("\n--- Creando elementos para Móvil ---");
        GameElementFactory MobileFactory = new MobileFactory();
        Character mobileWarrior = MobileFactory.createWarrior();
        Weapon mobileWeapon = MobileFactory.createWeapon();
        mobileWarrior.attack();
        mobileWeapon.use();
    }
}