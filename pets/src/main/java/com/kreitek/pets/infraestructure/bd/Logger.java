package com.kreitek.pets.infraestructure.bd;

public class Logger {
    private static Logger instance;
    private int contador;

    private Logger(){
        contador=0;
    }

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void debug(String message){
        contador++;
        System.out.println("[debug][" + contador + "] - " + message);
    }
}
