package org.example;

public class ImplLinkFact implements FicheroFact {
    @Override
    public Componentes crearFich(String nombre, int tamaño){
        Componentes componenteRef = new Fichero("FicheroRef", tamaño);
        return new Link(nombre, componenteRef);
    }
}
