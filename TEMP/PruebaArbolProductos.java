package com.estructurasnolienales;
public class PruebaArbolProductos {

    public static void main(String[] args) {
        // Creamos un nuevo árbol de productos

        ArbolProductos arbol = new ArbolProductos();


        arbol.insertar(new Producto("Mermelada", 10.5, 10, "Litro"));
        arbol.insertar(new Producto("refresco", 10.5, 10, "Litro"));
        arbol.insertar(new Producto("papas", 35.00, 20, "Kilogramo"));
        arbol.insertar(new Producto("aderezo", 22.3, 30, "Pieza"));
        arbol.insertar(new Producto("salsa", 20.3, 10, "Pieza"));
        arbol.insertar(new Producto("Doritos", 10.5, 10, "Litro"));
        arbol.insertar(new Producto("Agua", 35.00, 20, "Kilogramo"));
        arbol.insertar(new Producto("Palomitas", 22.3, 30, "Pieza"));
        arbol.insertar(new Producto("Chamoy", 20.3, 10, "Pieza"));

        // Imprimimos el árbol en orden inorden
        arbol.disparaInorden();
        System.out.println("\n \n \n");
        System.out.println("\u001B[36m <<---------- ARBOL ---------->>\u001B[0m");
        arbol.dibujarArbolProductos();
    }
}
