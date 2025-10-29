package com.empresa.suscripciones;

public class Main {
    public static void main(String[] args) {
        // Crear Clientes
        Cliente c1 = new Cliente("Romario", "Salas Cerdas", "123456789", "M", "San José");
        Cliente c2 = new Cliente("María", "González", "987654321", "Cartago");
        Cliente c3 = new Cliente();

        // Crear Suscripciones
        Suscripcion s1 = new Suscripcion("Básica", 7.99, 1);
        Suscripcion s2 = new Suscripcion("Estándar", 12.99, 1);
        Suscripcion s3 = new Suscripcion("Premium", 15.99, 1);

        // Probar suscribirse
        c1.suscribirse(s1);
        c2.suscribirse(s2);
        c3.suscribirse(new Suscripcion("VIP", 25.99, 1)); // suscripción anónima
    }
}
