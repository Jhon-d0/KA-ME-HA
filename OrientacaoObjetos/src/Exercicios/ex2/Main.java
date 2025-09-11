package Exercicios.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("------- Cadastro ------");
        System.out.println("Digite (1) para cadastrar Seminários");
        System.out.println("Digite (2) para cadastrar Alunos");
        System.out.println("Digite (3) para cadastrar Professores");
        System.out.println("Digite (4) para cadastrar Local");



        if (input.nextInt() == 1) {
            input.nextLine();
            System.out.println("-------Cadastro de Seminário------");
            System.out.print("Digite o titulo do Seminário: ");

            String tituloSeminario = input.nextLine();

            System.out.println("Este Seminário tem alunos? (S/N)");

            String alunoSeminario = input.next().toUpperCase().charAt(0) + "";

            if (alunoSeminario.equals("S")){

                System.out.println("Quantos alunos são?");

                int quantiaDeAlunos = input.nextInt();
                input.nextLine();

                String[] alunosDoSeminario = new String[quantiaDeAlunos];

                for (int i = 0; i < quantiaDeAlunos; i++) {
                    System.out.println("Digite o aluno " + (i + 1));
                    alunosDoSeminario[i] =  input.nextLine();
                }

                System.out.println("Digite o endereço do Seminário: ");
                String enderecoSeminario = input.nextLine();

                Seminario seminario = new Seminario(tituloSeminario);

                System.out.println(seminario);


            }else {
                return;
            }
        }
    }
}
