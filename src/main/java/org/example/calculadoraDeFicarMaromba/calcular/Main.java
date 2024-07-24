package org.example.calculadoraDeFicarMaromba.calcular;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

    }

    public void validarSexo(char sexo) {
        switch (sexo) {
            case 'M':
                System.out.println("--------");
                System.out.println("SEXO VALIDO : HOMEM");
                System.out.println("--------");
                break;
            case 'F':
                System.out.println("--------");
                System.out.println("SEXO VALIDO : MULHER");
                System.out.println("--------");
                break;
            default:
                System.out.println("\nERRO: SEXO INVALIDO");
        }
    }
    public void validarPeso(double peso){
        if (peso < 0){
            System.out.println("\nERRO: PESO MENOR OU IGUAL A ZERO");
        } else if(peso > 0){
            System.out.println("--------");
            System.out.println("PESO VALIDO");
            System.out.println("--------");
        }else{
            System.out.println("\nERRO: PESO INVALIDO");
        }
    }
    public void validarAltura(double altura){
        if (altura < 1.50){
            System.out.println("\nERRO: PROIBIDO ANAO");
        } else if(altura > 0){
            System.out.println("--------");
            System.out.println("ALTURA VALIDA");
            System.out.println("--------");
        }else{
            System.out.println("\nERRO: ALTURA INVALIDA");
        }
    }
    public void validarIdade(int idade){
        if (idade < 18){
            System.out.println("\nERRO: NAO ACEITA MENOR DE IDADE");
        } else if(idade > 18){
            System.out.println("--------");
            System.out.println("IDADE VALIDA");
            System.out.println("--------");
        }else{
            System.out.println("\nERRO: IDADE INVALIDA");
        }
    }
}