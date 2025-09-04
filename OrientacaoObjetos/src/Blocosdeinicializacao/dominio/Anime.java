package Blocosdeinicializacao.dominio;

public class Anime {
    public String nome;
    public int [] episodios;

//    O bloco de inicialização é iniciado toda vez que é criado um objeto da classe Anime

    {
        System.out.println("Iniciando anime");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
            System.out.print(" " + episodios[i]);
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }
}
