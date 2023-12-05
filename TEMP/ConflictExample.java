package com.estructurasnolienales;

public class ConflictExample {
    public static void main(String[] args) {
        // Ejemplo de condición while
        int contador = 0;
        while (contador < 5) {
            System.out.println("El contador es: " + contador);
            // Incrementamos el contador
            contador++;
        }
        System.out.println("Bucle de espera finalizado.");

        // Ejemplo de condición para simular carga
        boolean datosCargados = false;
        int intentos = 0;
        while (!datosCargados && intentos < 5) {
            try {
                Thread.sleep(1000);
                System.out.println("Esperando a que los datos se carguen...");
                // Aquí iría el código para cargar los datos
                // Si los datos se cargan correctamente, cambiaríamos el valor de datosCargados a true
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            intentos++;
        }
        if (datosCargados) {
            System.out.println("Datos cargados correctamente.");
        } else {
            System.out.println("No se pudieron cargar los datos después de " + intentos + " intentos.");
        }
    }
}
