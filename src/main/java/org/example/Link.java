package org.example;

public class Link implements Componentes{
    private String nombre;
    private Componentes componente;

    public Link(String nombre, Componentes componente) {
        this.nombre = nombre;
        this.componente = componente;
    }

    @Override
    public String getNombre(){
        return nombre;
    }

    @Override
    public int getTamaño(){
        return componente.getTamaño();
    }
}
