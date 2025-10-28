package Relacionais;

public class relacionais {
    public static void main(String[] args) {
        int numb1 = 1;
        int numb2 = 2;
        int resultado = numb1 + numb2;

//        % Resto
        int resto = 133 % 20;

        System.out.println(resto);

//        < > menor que e maior que
//        >= maior igual
//        <= menor ou igual
//        == comparando
//        =! diferente

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

    }
}
