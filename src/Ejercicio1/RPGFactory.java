/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Lenovo
 */
public class RPGFactory extends GameFactory {

    public RPGFactory() {
    }

    @Override
    public Game CreateGame() {
        return new RPGGame("The Witcher 3: Wild Hunt");
    }
    
}
