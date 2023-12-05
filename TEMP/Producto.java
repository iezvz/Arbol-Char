package com.estructurasnolienales;

public class Producto {
    private String nombreProducto;
    private Double precioUnitario;
    private int unidades;
    private String unidad_Medida;

    public Producto(String nombreProducto, Double precioUnitario, int unidades, String unidad_Medida) {
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
        this.unidades = unidades;
        this.unidad_Medida = unidad_Medida;
    }


    public String getNombreProducto() {
        return nombreProducto;
    }
 public Double getPrecioUnitario() {
        return precioUnitario;
    }

    
    public int getUnidades() {
        return unidades;
    }

    public String getUnidad_Medida() {
        return unidad_Medida;
    }

    public void setDatos(String nombreProducto, double precioUnitario, int unidades, String unidad_Medida) {
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
        this.unidades = unidades;
        this.unidad_Medida = unidad_Medida;
    }

}
