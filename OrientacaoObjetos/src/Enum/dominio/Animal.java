package Enum.dominio;

public class Animal {
    private String nome;
    private Tipodealimentacao tipo;


    public Animal(String nome, Tipodealimentacao tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Tipodealimentacao getTipo() {
        return tipo;
    }

    public void setTipo(Tipodealimentacao tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
