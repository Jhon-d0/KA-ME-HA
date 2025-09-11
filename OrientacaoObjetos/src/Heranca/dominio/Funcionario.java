package Heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Salario: " + this.salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                '}';
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
