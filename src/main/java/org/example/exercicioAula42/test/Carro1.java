package org.example.exercicioAula42.test;

import org.example.exercicioAula42.metodo.Carro;

public class Carro1 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
            carro1.nome = "Civic";
            carro1.modelo = "Tsi";
            carro1.ano = 2022;
        System.out.println(carro1.nome + "\n" + carro1.modelo + "\n" + carro1.ano);
    }
}
