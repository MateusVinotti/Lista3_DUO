import java.util.Scanner;

class ConversorMoeda {
    private double cotacaoDolar;
    private double quantidadeDolares;

    public ConversorMoeda(double cotacaoDolar, double quantidadeDolares) {
        this.cotacaoDolar = cotacaoDolar;
        this.quantidadeDolares = quantidadeDolares;
    }

    public double getCotacaoDolar() {
        return cotacaoDolar;
    }

    public double getQuantidadeDolares() {
        return quantidadeDolares;
    }

    public double converterDolarParaReal() {
        return cotacaoDolar * quantidadeDolares;
    }
}

public class exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotação do dólar:");
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Digite a quantidade de dólares disponíveis:");
        double quantidadeDolares = scanner.nextDouble();

        ConversorMoeda conversor = new ConversorMoeda(cotacaoDolar, quantidadeDolares);

        double valorEmReais = conversor.converterDolarParaReal();

        System.out.println("Valor em reais: R$" + valorEmReais);

        scanner.close();
    }
}

