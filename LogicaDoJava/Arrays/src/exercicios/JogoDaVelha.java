package exercicios;

public class JogoDaVelha {
    public static void main(String[] args) {

        char[][] tabuleiro = new char[3][3];

        // Preenchendo manualmente (exemplo de uma partida)
        tabuleiro[0][0] = 'X';
        tabuleiro[0][1] = 'O';
        tabuleiro[0][2] = 'X';
        tabuleiro[1][0] = 'O';
        tabuleiro[1][1] = 'X';
        tabuleiro[1][2] = 'O';
        tabuleiro[2][0] = 'X';
        tabuleiro[2][1] = ' ';
        tabuleiro[2][2] = 'O';

        // Imprimindo o tabuleiro
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < tabuleiro[i].length - 1) {
                    System.out.print(" | "); // separador entre colunas
                }
            }
            System.out.println(); // quebra de linha
            if (i < tabuleiro.length - 1) {
                System.out.println("---------"); // separador entre linhas
            }
        }

    }
}
