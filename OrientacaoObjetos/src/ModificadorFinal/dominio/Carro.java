package ModificadorFinal.dominio;

public class Carro {
    private String nome;
    private static double velocidadelimite = 240;
    public final int PNEUS = 4;
    public final Comprador COMPRADOR = new Comprador("João");
    public Vendedor vendedor = new Vendedor("Rodrigo");


    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Velocidade Limite: " + velocidadelimite);
        System.out.println("Quantidade de Pneus: " + PNEUS);
        System.out.println("Comprador: " + COMPRADOR.getNome());
        System.out.println("Vendedor: " + vendedor.getNome());
    }

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", PNEUS=" + PNEUS +
                ", COMPRADOR=" + COMPRADOR +
                ", vendedor=" + vendedor +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static double getVelocidadelimite() {
        return velocidadelimite;
    }

    public static void setVelocidadelimite(double velocidadelimite) {
        Carro.velocidadelimite = velocidadelimite;
    }
}
