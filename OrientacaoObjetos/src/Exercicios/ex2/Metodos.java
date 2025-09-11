package Exercicios.ex2;

public class Metodos {


    public static void limparTerminal() {
            // ANSI escape codes para limpar a tela
            System.out.print("\033[H\033[2J");
            System.out.flush();
    }

}
