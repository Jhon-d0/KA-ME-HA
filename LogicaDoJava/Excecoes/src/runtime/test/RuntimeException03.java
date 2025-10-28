package runtime.test;

import java.util.Random;

public class RuntimeException03 {
    public static void main(String[] args) {
        Random random = new Random();

        try {
            dividir(1, 0);
        }catch(RuntimeException e){
            int numeroAleatorio = random.nextInt(10) + 1;
            dividir(1, numeroAleatorio);
        }
    }

    public static void dividir(int a, int b) throws ArithmeticException {

        try {
            System.out.println(a / b);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Caiu no catch");// Não é obrigado a tratar pois ArithmeticException é filho de RuntimeException logo não é obrigado o tratamento.
            throw e;
        }

    }
}
