package com.emergentes.modelo;

public class Producto {
    private int id;
    private String desc;
    private int cantidad;
    private double precio;
    private String categoria;

    public Producto() {
        this.id = 0;
        this.desc = "";
        this.cantidad = 0;
        this.precio = 0;
        this.categoria = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
