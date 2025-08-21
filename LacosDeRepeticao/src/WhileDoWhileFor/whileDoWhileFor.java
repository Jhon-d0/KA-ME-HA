package WhileDoWhileFor;

public class whileDoWhileFor {
    public static void main(String[] args) {
//        While, Do While, For

        int cont = 0;
        while (cont < 10){
            System.out.print(++cont);
        }

        int contdowhile = 0;
        do {
            System.out.println(++contdowhile);
        } while (contdowhile < 10);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
