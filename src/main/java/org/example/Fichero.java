package org.example;

public class Fichero implements Componentes {
    private String nombre;
    private int tamaño;

    public Fichero(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTamaño(){
        return tamaño;
    }
}
