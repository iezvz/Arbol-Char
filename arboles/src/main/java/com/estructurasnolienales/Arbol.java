package com.estructurasnolienales;

public class Arbol {
    // ATRIBUTOS
    // nodo raiz del arbol
    NodoArbol inicial;

    // CONSTRUCTORES
    // inicializa el nodo raiz, este es el unico valor que conocemos
    // y sabemos donde esta
    public Arbol() {
        this.inicial = null;
    }

    // METODOS
    // insertar un nuevo nodo en el arbol
    public void insertar(char valor) {
        if (this.inicial == null) {
            this.inicial = new NodoArbol(valor); // Crea un nuevo nodo raíz con el valor
        } else {
            this.inicial.insertar(valor); // Inserta recursivamente en el árbol
        }
    }

    public void disparaInorden() {
        this.inorden(this.inicial);
    }

    public void inorden(NodoArbol nodo) {
        if (nodo == null) {
            return; // detener recursividad caso base
        } else {
            // Recorrer recursivamente el subárbol izquierdo
            inorden(nodo.getNodoIzq());
            // Visitar el nodo actual
            System.out.print(nodo.getValor() + " ");
            // Recorrer recursivamente el subárbol derecho
            inorden(nodo.getNodoDer());
        }
    }

    // metodos para disparar el ordenamiento
    public void disparaPreorden() {
        this.preorden(this.inicial);
    }

    public void disparaPostorden() {
        this.postorden(this.inicial);
    }

    public void preorden(NodoArbol nodo) {
        if (nodo == null) {
            return; // detener recursividad caso base
        } else {
            System.out.print(nodo.getValor() + " ");
            preorden(nodo.getNodoIzq());
            preorden(nodo.getNodoDer());
        }
    }

    public void postorden(NodoArbol nodo) {
        if (nodo == null) {
            return; // detener recursividad caso base
        } else {
            postorden(nodo.getNodoIzq());
            postorden(nodo.getNodoDer());
            System.out.print(nodo.getValor() + " ");
        }
    }

    public boolean buscar(char valor) {
        NodoArbol nodo = inicial;

        while (nodo != null) {
            if (valor == nodo.getValor()) {
                // System.out.println("encontrado");
                return true;
            } else if (valor < nodo.getValor()) {
                nodo = nodo.getNodoIzq();
            } else {
                nodo = nodo.getNodoDer();
            }
        }
        // System.out.println("no encontrado");
        return false;
    }

    public void dibujarArbol() {
        dibujarArbolRecursivo(this.inicial, 0);
    }

    // Método para dibujar el árbol de forma recursiva
    private void dibujarArbolRecursivo(NodoArbol nodo, int nivel) {
        // Si el nodo es nulo, terminamos la recursión
        if (nodo == null) {
            return;
        }

        // Dibujamos primero el subárbol derecho, incrementando el nivel
        dibujarArbolRecursivo(nodo.getNodoDer(), nivel + 1);

        // Si el nivel no es 0, imprimimos las líneas verticales correspondientes
        if (nivel != 0) {
            for (int i = 0; i < nivel - 1; i++) {
                System.out.print("│\t");
            }
            // Imprimimos el valor del nodo en color verde ─196 ├195 │179
            System.out.println("├───────\u001B[32m" + nodo.getValor() + "\u001B[0m");
        } else {
            // Si el nivel es 0, simplemente imprimimos el valor del nodo
            System.out.println("\u001B[32m" + nodo.getValor() + "\u001B[0m");
        }

        // Finalmente, dibujamos el subárbol izquierdo, incrementando el nivel
        dibujarArbolRecursivo(nodo.getNodoIzq(), nivel + 1);
    }

}