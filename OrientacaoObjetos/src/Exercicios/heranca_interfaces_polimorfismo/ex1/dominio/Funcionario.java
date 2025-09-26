package Exercicios.heranca_interfaces_polimorfismo.ex1.dominio;

import Exercicios.heranca_interfaces_polimorfismo.ex1.repository.FuncionarioRepository;


public abstract class Funcionario implements FuncionarioRepository {
     private String nome;
     private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
