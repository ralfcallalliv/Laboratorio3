/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Lenovo
 */
public enum NetworkConfig {
     INSTANCE;

    private String serverUrl = "127.0.0.1";
    private int port = 8080;

    public String getServerUrl() {
        return serverUrl;
    }

    public int getPort() {
        return port;
    }
}
