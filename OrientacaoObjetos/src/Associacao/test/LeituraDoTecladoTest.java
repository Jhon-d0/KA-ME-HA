package Associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do jogador: ");
        String nome = input.nextLine();
        System.out.println("Digite o time do jogador: ");
        String time = input.nextLine();
        System.out.println("Digite a idade do jogador: ");
        int idade = input.nextInt();
        System.out.println("Digite o sexo do jogador (M | F): ");
        char sexo = input.next().charAt(0);

        System.out.println(nome + " " + time + " " + idade + " " +  sexo);


    }
}
