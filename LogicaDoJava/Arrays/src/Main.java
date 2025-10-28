public class Main {
    public static void main(String[] args) {
//        Sem Array

        int number1 = 1;
        int number2 = 2;
        int number3 = 3;

        System.out.println(number1 + number2 + number3);

//        Com Array

        int [] numbers = new int [3];
        numbers[0] = number1;
        numbers[1] = number2;
        numbers[2] = number3;

        System.out.println(numbers[0]);

        String [] Nomes = new String[4];
        Nomes[0] = "Goku";
        Nomes[1] = "Vedita";
        Nomes[2] = "Levi";
        Nomes[3] = "Mikasa";

        for (int i = 0; i < Nomes.length; i++){
            System.out.println(Nomes[i]);
        }

        Nomes = new String[6];

        Nomes[0] = "Haji";
        Nomes[1] = "Haja";
        Nomes[2] = "Haje";
        Nomes[3] = "Habi";

        System.out.println(Nomes[0] +" "+ Nomes[1]);
    }
}