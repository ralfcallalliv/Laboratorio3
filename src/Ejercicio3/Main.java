/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        GameSession session = new GameSession();
        session.startSession();

        NetworkManager network = new NetworkManager();
        network.connect();

        DatabaseManager db = new DatabaseManager();
        db.saveData();

        // Cambiando el modo debug
        GameConfig.getInstance().setDebugMode(true);
        System.out.println("¿Modo debug activo? " + GameConfig.getInstance().isDebugMode());
    }
}
