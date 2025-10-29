package com.empresa.suscripciones;

public class Suscripcion {
    private String tipo;
    private double costo;
    private int periodicidad; // en meses

    public Suscripcion(String tipo, double costo, int periodicidad) {
        this.tipo = tipo;
        this.costo = costo;
        this.periodicidad = periodicidad;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCosto() {
        return costo;
    }

    public int getPeriodicidad() {
        return periodicidad;
    }
}
