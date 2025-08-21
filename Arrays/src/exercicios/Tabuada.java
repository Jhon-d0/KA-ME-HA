package exercicios;

public class Tabuada {
    public static void main(String[] args) {

        int[][] tabuada = new int[10][10];

        // Preenchendo a matriz com os valores da multiplicação
        for (int i = 0; i < tabuada.length; i++) {         // linhas
            for (int j = 0; j < tabuada[i].length; j++) {  // colunas
                tabuada[i][j] = (i + 1) * (j + 1);
            }
        }

        // Exibindo a tabuada formatada
        for (int i = 0; i < tabuada.length; i++) {
            for (int j = 0; j < tabuada[i].length; j++) {
                System.out.print(tabuada[i][j] + "\t"); // \t dá um espaçamento
            }
            System.out.println(); // quebra de linha a cada linha da matriz
        }

    }
}
