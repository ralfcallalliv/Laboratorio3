/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Lenovo
 */
public class NetworkManager {
    public void connect(){
        GameConfig config = GameConfig.getInstance();
        NetworkConfig netConfig = NetworkConfig.INSTANCE;

        System.out.println("Conectando al servidor: " + netConfig.getServerUrl() + ":" + netConfig.getPort());
        System.out.println("Usando base de datos: " + config.getDatabaseUrl());
    }
}
