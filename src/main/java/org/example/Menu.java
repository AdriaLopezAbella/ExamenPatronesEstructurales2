package org.example;

public class Menu {
    public static void menu(){
        // Crea las factorías
        FicheroFact ficheroFactory = new ImplFicheroFact();
        FicheroFact linkFactory = new ImplLinkFact();
        FicheroFact directorioFactory = new ImplDirectoryFact();

        // Crea un fichero, un link y un directorio
        Componentes fichero = ficheroFactory.crearFich("Fichero", 20);
        Componentes link = linkFactory.crearFich("Link", 10);
        Componentes directorio = directorioFactory.crearFich("Directorio", 2);

        // Imprime los nombres y tamaños
        System.out.println(fichero.getNombre() + ": " + fichero.getTamaño());
        System.out.println(link.getNombre() + ": " + link.getTamaño());
        System.out.println(directorio.getNombre() + ": " + directorio.getTamaño());

        // Agrega el fichero y el link al directorio
        ((Directory) directorio).agregarComponenente(fichero);
        ((Directory) directorio).agregarComponenente(link);

        // Imprime el tamaño del directorio nuevamente (debería ser la suma de los tamaños del fichero y del link)
        System.out.println(directorio.getNombre() + ": " + directorio.getTamaño());
    }
}
