package Casting;

// Casting é a conversão de um tipo de dado para outro.
// Pode ser implícito (automático) quando o tipo menor vira maior,
// ou explícito (forçado) usando (tipo) quando queremos converter tipos maiores ou incompatíveis.
// Atenção: casting explícito pode causar perda de dados se o valor não couber no novo tipo.


public class casting {
    public static void main(String[] args) {
        //int, double, float, long, short, chat, byte, boolean
        int idade = (int) 10000000000000L;
        double altura = 20;
        float peso = 50;
        long distancia = 1000;
        short distanciaMenor = 10;
        char sexo = 'M';
        byte espaco = 1;
        boolean falseOrTrue = true;


        System.out.println("idade: " + idade);
    }
}
