package Exercicios.ex1;

public class Funcionario {
    public String nome;
    public int idade;
    public Salario salario;

    public void imprimirDados() {
        System.out.println("---IMPRIMINDO DADOS---");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Salarios: "+this.salario.salario1 + " - "+this.salario.salario2 + " - "+this.salario.salario3);
    }

    public Funcionario(String nome, int idade, Salario salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }


}
