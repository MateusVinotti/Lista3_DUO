import java.util.Scanner;

class Compra {
    private double valorCompra;

    public Compra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public double calcularValorPrestacao() {
        return valorCompra / 5;
    }
}

public class exer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        Compra compra = new Compra(valorCompra);

        double valorPrestacao = compra.calcularValorPrestacao();

        System.out.println("Valor de cada prestação (em 5 prestações sem juros): R$" + valorPrestacao);

        scanner.close();
    }
}

