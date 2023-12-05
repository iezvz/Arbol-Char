package com.estructurasnolienales;


public class Main1 {
    public static void main(String[] args) {
        ArbolBusqueda arbol = new ArbolBusqueda();

        // Insertar estudiantes de ejemplo
        arbol.insertar(new Estudiante(123, "A", "Juan", "Informática"));
        arbol.insertar(new Estudiante(456, "B", "Maria", "Biología"));
        arbol.insertar(new Estudiante(789, "C", "Pedro", "Química"));

        // Buscar y mostrar datos de un estudiante por matrícula
        arbol.buscarMostrarDatos(456);

        // Buscar y mostrar estudiantes por carrera
        arbol.buscarPorCarrera("Química");
    }
}
