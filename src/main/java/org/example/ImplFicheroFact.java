package org.example;

public class ImplFicheroFact implements FicheroFact{
    @Override
    public Componentes crearFich(String nombre, int tamaño){
        return new Fichero(nombre, tamaño);
    }
}
