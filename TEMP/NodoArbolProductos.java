package com.estructurasnolienales;

public class NodoArbolProductos {

    // ATRIBUTOS
    // representa el valor del nodo
    private Producto producto;
    // referencia al hijo izquierdo de manera recursiva
    private NodoArbolProductos nodoIzq;
    // referencia al hijo derecho de manera recursiva
    private NodoArbolProductos nodoDer;

    // CONSTRUCTOR
    // Crea un nuevo nodo con el valor especificado, apuntando sus hijos a null
    public NodoArbolProductos(Producto producto) {
        this.producto = producto;
        this.nodoIzq = null;
        this.nodoDer = null;
    }

    // GETTERS Y SETTERS
    // devuelve el valor del nodo actual
    public Producto getProducto() {
        return producto;
    }
    public String getNombreProducto(){
        return this.getProducto().getNombreProducto();
    }

    // establecer el valor del nodo
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    // devuelve el nodo izquiedo
    public NodoArbolProductos getNodoIzq() {
        return nodoIzq;
    }

    // devuelve el nodo derecho
    public NodoArbolProductos getNodoDer() {
        return nodoDer;
    }

    // METODOS
    public void insertar(Producto producto) {
        if (producto.getNombreProducto().compareTo(this.producto.getNombreProducto()) < 0) {
            if (this.nodoIzq == null) {
                this.nodoIzq = new NodoArbolProductos(producto);
            } else {
                this.nodoIzq.insertar(producto);
            }
        } else {
            if (this.nodoDer == null) {
                this.nodoDer = new NodoArbolProductos(producto);
            } else {
                this.nodoDer.insertar(producto);
            }
        }
    }


}
