package com.churreria.sabores;

public class SaborFresa implements ISabor {
    @Override
    public String getNombre() {
        return "Fresa";
    }

    @Override
    public void aplicarRelleno() {
        System.out.println("  [Inyector] Inyectando mermelada natural de fresa.");
    }

    @Override
    public double getCostoAdicional() {
        return 1.20;
    }
}
