import java.util.Scanner;

class Carro {
    private double custoFabrica;

    public Carro(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double getCustoFabrica() {
        return custoFabrica;
    }

    public double calcularCustoConsumidor() {
        double impostos = custoFabrica * 0.45;
        double percentagemDistribuidor = (custoFabrica + impostos) * 0.28;
        return custoFabrica + impostos + percentagemDistribuidor;
    }
}

public class exer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro:");
        double custoFabrica = scanner.nextDouble();

        Carro carro = new Carro(custoFabrica);

        double custoConsumidor = carro.calcularCustoConsumidor();

        System.out.println("O custo ao consumidor do carro é: R$" + custoConsumidor);

        scanner.close();
    }
}
