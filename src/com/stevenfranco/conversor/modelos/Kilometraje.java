package com.stevenfranco.conversor.modelos;

public class Kilometraje {
    private String descripcion;
    private double tasaDeCambio;
    private String unidadMedida;


    public String getDescripcion() {
        return descripcion;
    }

    public double getTasaDeCambio() {
        return tasaDeCambio;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public double convertir(double valor) {
        return valor * tasaDeCambio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTasaDeCambio(double tasaDeCambio) {
        this.tasaDeCambio = tasaDeCambio;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    @Override
    public String toString() {
        return getDescripcion();
    }
}
