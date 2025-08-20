package TabelaVerdade;

public class tabelaTrue {
    public static void main(String[] args) {
        // ---------------------------
        // TABELA VERDADE - AND (&&)
        // ---------------------------
        // V && V = V
        // V && F = F
        // F && V = F
        // F && F = F
        // Exemplo: V && V && V && F = F
        //
        // ---------------------------
        // TABELA VERDADE - OR (||)
        // ---------------------------
        // V || V = V
        // V || F = V
        // F || V = V
        // F || F = F
        // Exemplo: F || F || F || V = V
        //
        // ---------------------------
        // TABELA VERDADE - NOT (!)
        // ---------------------------
        // !V = F
        // !F = V

        boolean A = true;
        boolean B = false;

        System.out.println("A && B = " + (A && B));
        System.out.println("A || B = " + (A || B));
        System.out.println("!A = " + (!A));
        System.out.println("!B = " + (!B));
    }
}
