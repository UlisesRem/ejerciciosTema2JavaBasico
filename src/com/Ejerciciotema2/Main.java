package com.Ejerciciotema2;

public class Main {
    public static void main(String[] args) {
        System.out.println(getPrecio(100d));
        System.out.println("El articulo: "+ getPrecio("Gato barato"+ " tiene un coste con IVA de: "+getPrecio(500d)));
    }

    //Se obtiene valor del IVA del producto mediante el precio
    //El IVA en México es el 0.16% del precio total del producto/servicio adquirido
    static double getPrecio(double precio){
        double IVA = precio*0.16d;
        return precio+IVA;
    }

    static String getPrecio(String articulo){
        return articulo;
    }
}