package Atribuicao;

public class Atribuicao {
    public static void main(String[] args) {

//        = += -= *= /= %=

        double bonus = 2000;
        System.out.println("Bonus: " + bonus);
        bonus += 1000;
        System.out.println(bonus);
        bonus -= 1000;
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus /= 2;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);

        int contador2 = 0;
        contador2++;
        System.out.println(contador2);
        contador2--;
        System.out.println(contador2);
        System.out.println(--contador2);
        System.out.println(++contador2);

        int contador = 0;
        while(contador < 10){
            contador++;
            if(contador == 10){
                System.out.println(contador);
                break;
            }
            System.out.println(contador);
        }


    }
}
