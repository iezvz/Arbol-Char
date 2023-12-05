package com.estructurasnolienales;

// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Set;

public class Main {

    // public static String quitarRepetidas(String texto) {
    //     //Set<Character> letras = new HashSet<>();
    //     char[] letras = new char[texto.length()];
    //     int j=0;
    //     for (int i=0;i>= texto.length();i++) {
    //         if(Arrays.hashCode(letras, texto.toCharArray()[i]))
    //         letras[j]=texto.toCharArray()[i];
    //     }
       
    //     return letras.toString();
    // }

    public static void main(String[] args) {
        String nombre = "jesularmtinz";
        nombre = nombre.toUpperCase();
        Arbol arbol = new Arbol();
        for (char letra: nombre.toCharArray()){
            arbol.insertar(letra);
        }      
        System.out.println("\n"+nombre+"\n");
        System.out.println("INORDEN: ");
        arbol.disparaInorden();
        System.out.println("");
        System.out.println("POSTORDEN: ");
        arbol.disparaPostorden();
        System.out.println("");
        System.out.println("PREORDEN: ");
        arbol.disparaPreorden();
        System.out.println("");
        System.out.println("<<----------ARBOL---------->>");
        arbol.dibujarArbol();

    }
}