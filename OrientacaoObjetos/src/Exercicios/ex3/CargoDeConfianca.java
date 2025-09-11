package Exercicios.ex3;

public abstract class CargoDeConfianca extends Funcionario{

    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String rg, String cpf, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, rg, cpf, sexo, salarioBase, dataNascimento, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    @Override
    public double getSalarioFinal() {
        return super.getSalarioFinal();
    }
}
