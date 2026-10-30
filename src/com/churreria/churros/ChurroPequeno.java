package com.churreria.churros;

import com.churreria.sabores.ISabor;

public class ChurroPequeno extends Churro {
    public ChurroPequeno(ISabor sabor) {
        super(sabor, 2.00);
    }

    @Override
    public void preparar() {
        System.out.println("\n[Máquina] Extruyendo masa para Churro PEQUEÑO (10 cm) - Sabor: " + sabor.getNombre());
        sabor.aplicarRelleno();
    }

    @Override
    public double calcularPrecioTotal() {
        return precioBase + sabor.getCostoAdicional();
    }
}
