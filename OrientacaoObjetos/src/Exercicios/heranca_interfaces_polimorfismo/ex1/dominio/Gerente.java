package Exercicios.heranca_interfaces_polimorfismo.ex1.dominio;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public void calcularSalario() {
        setSalario(getSalario() + bonus);
        System.out.println(getSalario());
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
