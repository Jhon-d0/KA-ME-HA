package Exercicios.ex3;

public enum Sexo {
    MASCULINO("Masculino"), FEMININO("Feminino");

    public String sexp;

    Sexo(String sexp) {
        this.sexp = sexp;
    }

    public String getSexp() {
        return sexp;
    }
}
