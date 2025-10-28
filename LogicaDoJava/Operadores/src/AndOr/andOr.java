package AndOr;

public class andOr {
    public static void main(String[] args) {
//        && = and
//        || = or

        int a=10;
        int b=105;
        int i= 12;

        boolean c = a < b &&  i >= b;
        boolean d = a < b ||  i >= b;

        System.out.println(c + " " + d);

        int playstation5 = 4000;
        int contacorrente = 4000;
        int contapoupanca = 2000;

        boolean buyorno = contacorrente >= playstation5 || contapoupanca >= playstation5;

        System.out.println(buyorno);

        if (buyorno) {
            System.out.println("Sim, você pode comprar seu playstation 5");
        }else {
            System.out.println("Não da pra você comprar seu playstation 5");
        }
    }
}
