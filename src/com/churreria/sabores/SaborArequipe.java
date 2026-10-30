package com.churreria.sabores;

public class SaborArequipe implements ISabor {
    @Override
    public String getNombre() {
        return "Arequipe";
    }

    @Override
    public void aplicarRelleno() {
        System.out.println("  [Inyector] Inyectando dulce de leche artesanal.");
    }

    @Override
    public double getCostoAdicional() {
        return 1.30;
    }
}
