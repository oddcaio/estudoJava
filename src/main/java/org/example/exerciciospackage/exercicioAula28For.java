package org.example.exerciciospackage;

public class exercicioAula28For {
    // Imprima todos numeros pares de 0 até 1 milhão (6 zeros)!!
    public static void main(String[] args) {
        for (int num = 0; num <= 1000000; num = num     + 2) {
            System.out.println("Numero par:" + num);
        }
    }
}
