package Ejercicio3;

public class GameConfig {
    // Instancia única (singleton)
    private static volatile GameConfig instance;

    private String databaseUrl;
    private boolean debugMode;
    private int maxPlayers;

    // Constructor privado
    private GameConfig() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/game";
        this.debugMode = false;
        this.maxPlayers = 10;
    }

    // Singleton thread-safe con double-checked locking
    public static GameConfig getInstance() {
        if (instance == null) {
            synchronized (GameConfig.class) {
                if (instance == null) {
                    instance = new GameConfig();
                }
            }
        }
        return instance;
    }

    // Getters y Setters
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
    }

    public boolean isDebugMode() {
        return debugMode;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }
}