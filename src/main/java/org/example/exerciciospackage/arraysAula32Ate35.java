package org.example.exerciciospackage;

public class arraysAula32Ate35 {
    public static void main(String[] args) {
/*  TEM DUAS FORMAS DE INICIAR UMA ARRAY:
aqui separei uma quantidade de memória e coloquei uma quantidade de 5 index  então
tem 5 espaços e todos estão vazios, logo consigo alocar depois e eles serão considerados
comos vazios*/

        String[] nomes = new String[5]; // 5 INDEX DE NOME VAZIOS
        nomes[1] = "zézinho"; //INDICE 1 DE NOME ALOCADO COMO ZEZINHO

// mas consigo criar um array e colocar um valor sem ter que gastar duas linhas

        String[] sobrenomes = {"Amado","Pereira","Samurai"}; // CRIADO 2 SOBRENOMES

// for para mostrar os sobrenomes:
        for (int i = 0; i < sobrenomes.length; i++){
            System.out.println(sobrenomes[i]);
        }
//      oooou
        for (String palavrabacana : sobrenomes) {
            System.out.println(palavrabacana);
        }
    }
}
