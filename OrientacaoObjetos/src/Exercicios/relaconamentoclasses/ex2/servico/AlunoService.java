package Exercicios.relaconamentoclasses.ex2.servico;

import Exercicios.relaconamentoclasses.ex2.dominio.Aluno;
import Exercicios.relaconamentoclasses.ex2.dominio.Turma;

public class AlunoService {

    public static void listarAlunos(Turma turma) {
        int quantiaDeAlunos = 0;
        System.out.println("Listando alunos na turma " + turma.getNumeroDaTurma());
        for (Aluno aluno : turma.getAlunos()){
            System.out.println(aluno.getNome());
            quantiaDeAlunos++;
        }
        System.out.println("Turma finalizada com " + quantiaDeAlunos + " alunos");
    }

    public static void adicionarAluno(Aluno[] aluno, Turma turma) {
        System.out.println("Adicionando " + aluno + " na turma " + turma.getNumeroDaTurma());
        turma.setAlunos(aluno);
    }
}
