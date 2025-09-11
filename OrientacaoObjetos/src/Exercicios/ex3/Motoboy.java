package Exercicios.ex3;

public class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy(String nome, String rg, String cpf, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, String placaDaMoto) {
        super(nome, rg, cpf, sexo, salarioBase, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlaDaMoto() {
        return placaDaMoto;
    }

    public void setPlaDaMoto(String plaDaMoto) {
        this.placaDaMoto = plaDaMoto;
    }

    @Override
    public double getSalarioFinal() {
        return super.getSalarioFinal();
    }
}
