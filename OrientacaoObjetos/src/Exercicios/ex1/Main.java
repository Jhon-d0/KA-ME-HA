package Exercicios.ex1;

public class Main {
    public static void main(String[] args) {
        Salario salarios = new Salario(2400, 3000, 3300);
        Funcionario f1 = new Funcionario("Fernando", 20, salarios);


        f1.imprimirDados();
        salarios.mediaSalarial();

    }
}
