package Enum.dominio;

public enum TipoDePagamento {
    DEBITO{
        @Override
        public double CalcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO{
        @Override
        public double CalcularDesconto(double valor) {
            return valor * 0.05;
        }
    },
    AVISTA{
        @Override
        public double CalcularDesconto(double valor) {
            return valor * 0.2;
        }
    };


    public abstract double CalcularDesconto(double valor);
}
