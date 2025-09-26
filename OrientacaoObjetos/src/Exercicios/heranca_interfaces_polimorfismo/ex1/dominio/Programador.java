package Exercicios.heranca_interfaces_polimorfismo.ex1.dominio;



public class Programador extends Funcionario{
    private double horasextras;

    public Programador(String nome, double salario, double horasextras) {
        super(nome, salario);
        this.horasextras = horasextras;
    }

    @Override
    public void calcularSalario() {
        setSalario(getSalario() + (horasextras * (getSalario() * 0.025)));
        System.out.println(getSalario());
    }
}
