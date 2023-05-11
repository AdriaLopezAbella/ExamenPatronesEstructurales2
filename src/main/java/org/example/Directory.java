package org.example;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Componentes{
    private String nombre;
    private List<Componentes> componentes;

    public Directory(String nombre) {
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTamaño(){
        int tamañoTotal = 0;
        for (Componentes componente : componentes){
            tamañoTotal += componente.getTamaño();
        }
        return tamañoTotal;
    }

    public void agregarComponenente(Componentes componente){
        componentes.add(componente);
    }
}

