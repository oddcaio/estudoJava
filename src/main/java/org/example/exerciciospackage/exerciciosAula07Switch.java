package org.example.exerciciospackage;

public class exerciciosAula07Switch {
    public static void main(String[] args) {
        //Utilizando switch e dados os valores de 1 a 7, imprima se é útil ou final de semana
        //Considerando 1 como domingo
        int dia = 10;
        switch (dia){
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Não existe esse resposta, bocó.");
                break;
        }
    }
}
