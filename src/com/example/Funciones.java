package com.example;

public class Funciones {
    public static void main(String[] args) {
      double price = 14.99d;
      int IVA = 21;
      double resultado1 = price * IVA;
      double totalIVA = obtenerIVA(14.99,21);
        System.out.println((totalIVA/100)+price);
    }
    static double obtenerIVA (double price, int IVA){
        return price * IVA;
    }
}