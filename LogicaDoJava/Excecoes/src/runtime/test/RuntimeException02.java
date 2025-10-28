package runtime.test;

public class RuntimeException02 {
    public static void main(String[] args) {
        dividir(1, 0);
    }

    public static void dividir(int a, int b) throws ArithmeticException {

        try {
            System.out.println(a / b);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Caiu no catch");// Não é obrigado a tratar pois ArithmeticException é filho de RuntimeException logo não é obrigado o tratamento.
        }

    }
}
