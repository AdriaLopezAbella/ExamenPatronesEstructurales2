package org.example;

public class ImplDirectoryFact implements FicheroFact{
    @Override
    public Componentes crearFich(String nombre, int tamaño){
        return new Directory(nombre);
    }
}
