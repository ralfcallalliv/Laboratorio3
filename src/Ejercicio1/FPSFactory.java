/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Lenovo
 */
public class FPSFactory extends GameFactory{

    public FPSFactory() {
    }

    @Override
    public Game CreateGame() {
        return new FPSGame("Doom Eternal"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
