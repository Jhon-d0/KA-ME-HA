package ModificadorFinal.dominio;

public class Ferrari extends Carro {
    private String modelo;

    public Ferrari(String nome, String modelo) {
        super(nome);
        this.modelo = modelo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Modelo: " + modelo);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
