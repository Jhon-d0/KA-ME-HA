package Abstract.dominio;

public class Desenvolvedor extends Funcionario{
    private String desenvolve;

    public Desenvolvedor(String nome, double salario, String desenvolve) {
        super(nome, salario);
        this.desenvolve = desenvolve;
    }

    @Override
    public void calcularSalario() {
        this.salario += salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "desenvolve='" + desenvolve + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String getDesenvolve() {
        return desenvolve;
    }

    public void setDesenvolve(String desenvolve) {
        this.desenvolve = desenvolve;
    }


}
