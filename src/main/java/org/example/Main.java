package org.example;
import java.time.LocalDate;

import static org.example.MateriasPrimas.*;
public class Main {
    public static void main(String[] args) {
        //Cerveza con constructor por defecto
        Cerveza cerveza1 = new Cerveza();
        cerveza1.setMarca("Brahma");
        cerveza1.setCantidadReal(600);
        cerveza1.setCantidadEstablecida(600);
        cerveza1.setFechaFabricacion(LocalDate.now());
        cerveza1.setMateriasPrimas(T);
        cerveza1.setFechaVencimiento(LocalDate.now().plusDays(90));
        cerveza1.calcularCantidad();
        if (cerveza1.estaVencida())
            System.out.println("La cerveza está vencida");
        else
            System.out.println("La cerveza no está vencida");
        System.out.println(cerveza1);

        //Cerveza con constructor con parámetros
        Cerveza cerveza2 = new Cerveza("Patagonia",
                LocalDate.now(),
                LocalDate.now().plusDays(90),
                M,
                600,
                600);
        cerveza2.calcularCantidad();
        if (cerveza2.estaVencida())
            System.out.println("La cerveza está vencida");
        else
            System.out.println("La cerveza no está vencida");
        System.out.println(cerveza2);

        //Cerveza con constructor de marca, materia prima y cantidad real
        Cerveza cerveza3 = new Cerveza("Quilmes", C, 600);
        cerveza3.calcularCantidad();
        if (cerveza3.estaVencida())
            System.out.println("La cerveza está vencida");
        else
            System.out.println("La cerveza no está vencida");
        System.out.println(cerveza3);

        }
    }