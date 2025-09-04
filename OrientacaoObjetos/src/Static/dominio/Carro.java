package Static.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    {
//        vai rodar toda vez que criar o objeto carro
        System.out.println("Iniciando Carro");
    }

    static {
//        Vai rodar apenas uma vez quando chamar a classe
        System.out.println("Iniciando Carro no static");
    }

    public void imprimir(){
        System.out.println("---------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    public static void mudarVelocidadeLimite(double limite){
        Carro.velocidadeLimite = limite;
        return;
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
