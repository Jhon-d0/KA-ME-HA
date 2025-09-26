package Exercicios.relaconamentoclasses.ex2.dominio;

public class Turma {
    private Aluno[] alunos;
    private double numeroDaTurma;

    public Turma(double numeroDaTurma) {
        this.numeroDaTurma = numeroDaTurma;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public double getNumeroDaTurma() {
        return numeroDaTurma;
    }

    public void setNumeroDaTurma(double numeroDaTurma) {
        this.numeroDaTurma = numeroDaTurma;
    }
}
