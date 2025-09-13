package Enum.dominio;

public enum TipoCliente {
    PESSOA_JURIDICA("Pessoa Juridica", 1),
    PESSOA_FISICA("Pessoa Física", 2);

    public final String pessoa;
    public final int valor;

    TipoCliente(String pessoa,  int valor) {
        this.pessoa = pessoa;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "TipoCliente{" +
                "pessoa='" + pessoa + '\'' +
                ", valor=" + valor +
                '}';
    }
}
