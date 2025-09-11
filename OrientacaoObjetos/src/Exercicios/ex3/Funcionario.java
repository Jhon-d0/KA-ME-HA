package Exercicios.ex3;

public abstract class Funcionario implements SalarioFinal {

    protected String nome;
    protected String rg;
    protected String cpf;
    protected Sexo sexo;
    protected double salarioBase;
    protected String dataNascimento;
    protected String dataAdmissao;

    public Funcionario(String nome, String rg, String cpf, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.sexo = sexo;
        this.salarioBase = salarioBase;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                '}';
    }

    @Override
    public double getSalarioFinal() {
        return 0;
    }
}
