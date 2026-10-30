package com.churreria.sabores;

public class SaborChocolate implements ISabor {
    @Override
    public String getNombre() {
        return "Chocolate";
    }

    @Override
    public void aplicarRelleno() {
        System.out.println("  [Inyector] Añadiendo cobertura y relleno de chocolate 70%.");
    }

    @Override
    public double getCostoAdicional() {
        return 1.50;
    }
}
