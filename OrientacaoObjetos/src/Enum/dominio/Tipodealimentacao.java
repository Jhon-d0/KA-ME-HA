package Enum.dominio;

import Polimorfismo.dominio.Taxavel;
import com.sun.jdi.Value;

public enum Tipodealimentacao {
    VEGETARIANO("Vegetariano"){
        @Override
        public void comer() {
            System.out.println("Comendo vegetariano");
        }
    },
    CARNIVORO("Carvindo"){
        @Override
        public void comer() {
            System.out.println("Comendo carvindo");
        }
    },
    ONIVORO("Onivoro"){
        @Override
        public void comer() {
            System.out.println("Comendo Onivoro");
        }
    };

    public String tipodealimentacao;

    Tipodealimentacao(String tipodealimentacao) {
        this.tipodealimentacao = tipodealimentacao;
    }

    public static Tipodealimentacao procurandotipo(String buscadousuario) {
        for (Tipodealimentacao tipo : values()) {
            if (tipo.tipodealimentacao.equals(buscadousuario)) {
                return tipo;
            }
        }
        return null;
    }

    public abstract void comer();
}
