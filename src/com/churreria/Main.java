package com.churreria;

import com.churreria.churros.*;
import com.churreria.sabores.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instanciación limpia usando interfaces
        ISabor chocolate = new SaborChocolate();
        ISabor fresa = new SaborFresa();
        ISabor arequipe = new SaborArequipe();

        // Procesamiento en lote utilizando polimorfismo sin 'if/else' ni 'switch'
        List<Churro> pedidos = List.of(
            new ChurroPequeno(chocolate),
            new ChurroGrande(fresa),
            new ChurroMediano(arequipe)
        );

        for (Churro churro : pedidos) {
            churro.preparar();
            System.out.printf("  Precio final: $%.2f%n", churro.calcularPrecioTotal());
        }
    }
}
