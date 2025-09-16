package Interfaces.dominio;

public interface DataRemove {

    String remover = "Removendo";

    public static final String adicionando = "Adicionando";

    default void Remover(){

        System.out.println("Removendo...");
    }

    public abstract void Adicionar();

    public default  void Remover2(){
        System.out.println("Removendo...");
    }

    public static void   Adicionar2(){
        System.out.println("Adicionando...");
    }

}
