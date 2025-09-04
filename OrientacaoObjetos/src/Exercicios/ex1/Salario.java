package Exercicios.ex1;

public class Salario {
    public double salario1;
    public double salario2;
    public double salario3;

    public void mediaSalarial(){
        System.out.println("----IMPRIMINDO SALARIO TOTAL----");
        double somaSalario = salario1+salario2+salario3;
        System.out.println("Salario total: "+somaSalario);
    }

    public Salario(double salario1, double salario2, double salario3) {
        this.salario1 = salario1;
        this.salario2 = salario2;
        this.salario3 = salario3;
    }

    @Override
    public String toString() {
        return "Salario{" +
                "salario1=" + salario1 +
                ", salario2=" + salario2 +
                ", salario3=" + salario3 +
                '}';
    }
}
