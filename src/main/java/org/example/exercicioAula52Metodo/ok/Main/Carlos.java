import org.example.exercicioAula52Metodo.ok.Funcionario;

public static void main(String[] args) {
    Funcionario Carlos = new Funcionario();
    Carlos.nome = "Carlos Eduardo Costa";
    Carlos.idade = 32;
    Carlos.salario1 = 3.432;
    Carlos.salario2 = 7.100;
    Carlos.salario3 = 1.000;
    Carlos.calculaMedia();
    Carlos.imprimeDados();
}