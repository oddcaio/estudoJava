package org.example.exercicioAula52Metodo.ok;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario1;
    public double salario2;
    public double salario3;

    public void calculaMedia() { // Linha 9
        double resultado = this.salario1 + this.salario2 + this.salario3; // Linha 11
        resultado = resultado / 3;
        System.out.println("----------------------------------");
        System.out.println("Media: " + resultado + "\n");
    }

    public void imprimeDados() {
        System.out.println("------- DADOS: -------\n");
        System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade + "\nSalario 1: " + this.salario1 + "\nSalario 2: " + this.salario2 + "\nSalario 3: " + this.salario3); // Linha 19
        System.out.println("----------------------");
    }

}
