package br.edu.up;

import java.util.Scanner;

public class Veiculo {
    private double valor;
    private double desconto;

    public Veiculo(double valor, String tipoCombustivel) {
        if (tipoCombustivel.equalsIgnoreCase("álcool")) {
            this.desconto = valor * 0.25;
        } else if (tipoCombustivel.equalsIgnoreCase("gasolina")) {
            this.desconto = valor * 0.21;
        } else if (tipoCombustivel.equalsIgnoreCase("diesel")) {
            this.desconto = valor * 0.14;
        } else {
            this.desconto = 0;
        }
        this.valor = valor - this.desconto;
    }

    public double getValor() {
        return valor;
    }

    public double getDesconto() {
        return desconto;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalDesconto = 0;
        double totalPago = 0;
        while (true) {
            System.out.println("Digite o tipo de combustível (álcool, gasolina, diesel) ou 'zero' para encerrar:");
            String tipoCombustivel = scanner.nextLine().toLowerCase();
            if (tipoCombustivel.equals("zero")) {
                break;
            }
            double valorVeiculo;
            while (true) {
                System.out.println("Digite o valor do veículo:");
                if (scanner.hasNextDouble()) {
                    valorVeiculo = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer
                    break;
                } else {
                    System.out.println("Valor inválido. Digite novamente.");
                    scanner.nextLine(); // Limpar o buffer
                }
            }

            Veiculo veiculo = new Veiculo(valorVeiculo, tipoCombustivel);
            totalDesconto += veiculo.getDesconto();
            totalPago += veiculo.getValor();

            System.out.println("Valor do desconto: " + veiculo.getDesconto());
            System.out.println("Valor a ser pago pelo cliente: " + veiculo.getValor());
        }
        System.out.println("Total de desconto: " + totalDesconto);
        System.out.println("Total pago pelos clientes: " + totalPago);

        scanner.close();
    }
}

