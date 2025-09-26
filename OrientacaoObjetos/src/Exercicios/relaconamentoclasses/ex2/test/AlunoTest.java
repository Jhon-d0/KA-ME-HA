package Exercicios.relaconamentoclasses.ex2.test;

import Exercicios.relaconamentoclasses.ex2.dominio.Aluno;
import Exercicios.relaconamentoclasses.ex2.dominio.Turma;
import Exercicios.relaconamentoclasses.ex2.servico.AlunoService;

public class AlunoTest {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Rafael", "234234");
        Aluno aluno2 = new Aluno("Davi", "34243");
        Turma turma1 = new Turma(3);
        Aluno[]  alunos3 = {aluno1, aluno2};

        AlunoService.adicionarAluno(alunos3, turma1);
        AlunoService.listarAlunos(turma1);
    }
}
