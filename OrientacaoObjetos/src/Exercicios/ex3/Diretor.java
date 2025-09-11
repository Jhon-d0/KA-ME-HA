package Exercicios.ex3;

public class Diretor extends CargoDeConfianca{
    private double premio = 1.1;


    public Diretor(String nome, String rg, String cpf, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao, double premio) {
        super(nome, rg, cpf, sexo, salarioBase, dataNascimento, dataAdmissao, bonificacao);
        this.premio = premio;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "premio=" + premio +
                ", bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
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
        return super.getSalarioFinal();
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }
}
