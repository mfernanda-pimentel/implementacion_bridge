package com.churreria.churros;

import com.churreria.sabores.ISabor;

public abstract class Churro {
    // Puente hacia la interfaz del sabor (Composición)
    protected final ISabor sabor;
    protected final double precioBase;

    protected Churro(ISabor sabor, double precioBase) {
        if (sabor == null) {
            throw new IllegalArgumentException("El churro debe tener un sabor válido.");
        }
        this.sabor = sabor;
        this.precioBase = precioBase;
    }

    public abstract void preparar();
    public abstract double calcularPrecioTotal();
}
