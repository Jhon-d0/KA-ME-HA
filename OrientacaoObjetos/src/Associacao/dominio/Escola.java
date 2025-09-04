package Associacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professor;

    public Escola(String nome, Professor[] professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public void imprimir(){
        System.out.println("Escola: "+nome);
        if (professor==null) return;
        for (Professor p:professor){
            System.out.print(" "+p.getNome() + " |");
        }
    }

    public Professor[] getProfessor() {
        return professor;
    }

    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
