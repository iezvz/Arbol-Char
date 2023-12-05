package com.estructurasnolienales;

public class NodoArbol {
    // ATRIBUTOS
    // representa el valor del nodo
    private char valor;
    // referencia al hijo izquierdo de manera recursiva
    private NodoArbol nodoIzq;
    // referencia al hijo derecho de manera recursiva
    private NodoArbol nodoDer;

    // CONSTRUCTOR
    // Crea un nuevo nodo con el valor especificado, apuntando sus hijos a null
    public NodoArbol(char valor) {
        this.valor = valor;
        this.nodoIzq = null;
        this.nodoDer = null;
    }

    // GETTERS Y SETTERS
    // devuelve el valor del nodo actual
    public char getValor() {
        return valor;
    }

    // establecer el valor del nodo
    public void setValor(char valor) {
        this.valor = valor;
    }

    // devuelve el nodo izquiedo
    public NodoArbol getNodoIzq() {
        return nodoIzq;
    }

    // devuelve el nodo derecho
    public NodoArbol getNodoDer() {
        return nodoDer;
    }

    // METODOS
    public void insertar(char _valor) {
        // si el valor es menor a la raiz
        if (_valor < this.valor) {
            // insertar en lado izquierdo
            if (this.nodoIzq == null) {
                this.nodoIzq = new NodoArbol(_valor); // inserta el nuevo nodo
            } else {// llama recursivamente el metodo insertar hasta encontrar un nodo hoja
                this.nodoIzq.insertar(_valor); 
            }
        } else {// caso contrario, si el valor es mayor a la raiz
                // insertar en lado derecho
            if (this.nodoDer == null) {
                this.nodoDer = new NodoArbol(_valor);// inserta el nuevo nodo
            } else {
                this.nodoDer.insertar(_valor);// llama recursivamente el metodo insertar
            }
        }
    }

    

}
