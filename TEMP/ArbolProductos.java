package com.estructurasnolienales;


public class ArbolProductos {

    // ATRIBUTOS
    // nodo raíz del arbol
    NodoArbolProductos raiz;

    // CONSTRUCTORES
    // inicializa el nodo raiz, este es el unico valor que conocemos
    // y sabemos donde esta
    public ArbolProductos() {
        this.raiz = null;
    }

    // METODOS
    // insertar un nuevo nodo en el arbol
    public void insertar(Producto producto) {
        if (this.raiz == null) {
            this.raiz = new NodoArbolProductos(producto); // Crea un nuevo nodo raíz con el valor
        } else {
            this.raiz.insertar(producto); // Inserta recursivamente en el árbol
        }
    }

    public void disparaInorden() {
        this.inorden(this.raiz);
    }

    public void inorden(NodoArbolProductos nodo) {
        if (nodo == null) {
            return; // detener recursividad caso base
        } else {
            // Recorrer recursivamente el subárbol izquierdo
            inorden(nodo.getNodoIzq());
            // Visitar el nodo actual
            System.out.print(nodo.getProducto().getNombreProducto() + ", ");
            // Recorrer recursivamente el subárbol derecho
            inorden(nodo.getNodoDer());
        }
    }
    public void dibujarArbolProductos() {
        dibujarArbolRecursivoProductos(this.raiz, 0);
    }

    // Método para dibujar el árbol de forma recursiva
    private void dibujarArbolRecursivoProductos(NodoArbolProductos nodo, int nivel) {
        // Si el nodo es nulo, terminamos la recursión
        if (nodo == null) {
            return;
        }

        // Dibujamos primero el subárbol derecho, incrementando el nivel
        dibujarArbolRecursivoProductos(nodo.getNodoDer(), nivel + 1);

        // Si el nivel no es 0, imprimimos las líneas verticales correspondientes
        if (nivel != 0) {
            for (int i = 0; i < nivel - 1; i++) {
                System.out.print("│          ");
            }
            // Imprimimos el valor del nodo en color verde ─196 ├195 │179
            System.out.println("├──────────\u001B[32m" + nodo.getNombreProducto() + "\u001B[0m");
        } else {
            // Si el nivel es 0, simplemente imprimimos el valor del nodo
            System.out.println("\u001B[32m" + nodo.getNombreProducto() + "\u001B[0m");
        }

        // Finalmente, dibujamos el subárbol izquierdo, incrementando el nivel
        dibujarArbolRecursivoProductos(nodo.getNodoIzq(), nivel + 1);
    }
}
