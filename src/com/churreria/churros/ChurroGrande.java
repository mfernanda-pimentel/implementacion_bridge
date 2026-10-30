package com.churreria.churros;

import com.churreria.sabores.ISabor;

public class ChurroGrande extends Churro {
    public ChurroGrande(ISabor sabor) {
        super(sabor, 5.00);
    }

    @Override
    public void preparar() {
        System.out.println("\n[Máquina] Extruyendo masa para Churro GRANDE (30 cm) - Sabor: " + sabor.getNombre());
        sabor.aplicarRelleno();
    }

    @Override
    public double calcularPrecioTotal() {
        return precioBase + (sabor.getCostoAdicional() * 1.5);
    }
}
