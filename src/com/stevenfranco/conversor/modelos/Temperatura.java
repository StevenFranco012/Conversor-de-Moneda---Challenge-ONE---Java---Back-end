package com.stevenfranco.conversor.modelos;

public class Temperatura {

    private String descripcion;
    private String unidadTemperatura;
    private double tasaDeCambio;


    public String getDescripcion() {
        return descripcion;
    }

    public String getUnidadTemperatura() {
        return unidadTemperatura;
    }

    public double convertir(double valor) {
        return valor * tasaDeCambio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUnidadTemperatura(String unidadTemperatura) {
        this.unidadTemperatura = unidadTemperatura;
    }

    public void setTasaDeCambio(double tasaDeCambio) {
        this.tasaDeCambio = tasaDeCambio;
    }

    @Override
    public String toString() {
        return getDescripcion();
    }
}
