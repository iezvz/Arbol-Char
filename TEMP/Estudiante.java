package com.estructurasnolienales;

class Estudiante {
    int matricula;
    String grupo;
    String nombre;
    String carrera;

    public Estudiante(int matricula, String grupo, String nombre, String carrera) {
        this.matricula = matricula;
        this.grupo = grupo;
        this.nombre = nombre;
        this.carrera = carrera;
    }
}

class NodoArbol {
    Estudiante estudiante;
    NodoArbol izquierda, derecha;

    public NodoArbol(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.izquierda = this.derecha = null;
    }
}


