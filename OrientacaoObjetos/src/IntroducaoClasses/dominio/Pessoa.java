package IntroducaoClasses.dominio;

public class Pessoa {
    public String nome;
    public int idade;

    public void imprimirPessoa(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
    }


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
