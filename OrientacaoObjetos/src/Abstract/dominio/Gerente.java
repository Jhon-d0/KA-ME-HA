package Abstract.dominio;

public class Gerente extends Funcionario{
    private String gerenciamento;

    public Gerente(String nome, double salario, String gerenciamento) {
        super(nome, salario);
        this.gerenciamento = gerenciamento;
    }

    @Override
    public void calcularSalario() {
        this.salario += salario * 0.15;
    }

    @Override
    public String
    toString() {
        return "Gerente{" +
                "gerenciamento='" + gerenciamento + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String getGerenciamento() {
        return gerenciamento;
    }

    public void setGerenciamento(String gerenciamento) {
        this.gerenciamento = gerenciamento;
    }
}
