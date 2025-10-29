package com.empresa.suscripciones;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String cedula;
    private String sexo;
    private String ubicacion;

    // Constructor completo
    public Cliente(String nombre, String apellidos, String cedula, String sexo, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.sexo = sexo;
        this.ubicacion = ubicacion;
    }

    // Constructor sin sexo
    public Cliente(String nombre, String apellidos, String cedula, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.ubicacion = ubicacion;
    }

    // Constructor por defecto
    public Cliente() {
    }

    // Método para suscribirse
    public void suscribirse(Suscripcion s) {
        System.out.println(this.nombre + " " + this.apellidos + " adquirió una suscripción " + s.getTipo());
    }
}
