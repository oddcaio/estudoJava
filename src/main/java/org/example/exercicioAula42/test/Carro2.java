package org.example.exercicioAula42.test;

import org.example.exercicioAula42.metodo.Carro;

public class Carro2 {
    public static void main(String[] args) {
        Carro carro2 = new Carro();
        carro2.nome = "Golf";
        carro2.modelo = "Gti";
        carro2.ano = 2022;
        System.out.println(carro2.nome + "\n" + carro2.modelo + "\n" + carro2.ano);
    }
}
