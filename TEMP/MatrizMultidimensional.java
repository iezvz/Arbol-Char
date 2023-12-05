package com.estructurasnolienales;

public class MatrizMultidimensional {
    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Acceder a los elementos
        System.out.println("Elemento en la fila 1, columna 2: " + matriz[1][2]);
        // modifica a los elementos
        matriz[0][0] = 10;
        // Recorrer la matriz y mostrar los elementos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
