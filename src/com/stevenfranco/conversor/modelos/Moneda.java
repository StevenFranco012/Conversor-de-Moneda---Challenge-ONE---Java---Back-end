package com.stevenfranco.conversor.modelos;

public class Moneda {

    private String descripcion;
    private double tasaDeCambio;
    private String nombreMoneda;

    public String getDescripcion() {
        return descripcion;
    }

    public double getTasaDeCambio() {
        return tasaDeCambio;
    }

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTasaDeCambio(double tasaDeCambio) {
        this.tasaDeCambio = tasaDeCambio;
    }

    public void setNombreMoneda(String nombreMoneda) {
        this.nombreMoneda = nombreMoneda;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
