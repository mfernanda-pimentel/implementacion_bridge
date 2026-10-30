package com.churreria.churros;

import com.churreria.sabores.ISabor;

public class ChurroMediano extends Churro {
    public ChurroMediano(ISabor sabor) {
        super(sabor, 3.50);
    }

    @Override
    public void preparar() {
        System.out.println("\n[Máquina] Extruyendo masa para Churro MEDIANO (20 cm) - Sabor: " + sabor.getNombre());
        sabor.aplicarRelleno();
    }

    @Override
    public double calcularPrecioTotal() {
        return precioBase + (sabor.getCostoAdicional() * 1.2);
    }
}
