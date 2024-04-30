package br.edu.up;

import java.util.Scanner;

public class ContaDeLuz {
    private int tipoCliente;
    private double valorKW;

    public ContaDeLuz(int tipoCliente) {
        this.tipoCliente = tipoCliente;
        this.valorKW = obterValorKW(tipoCliente);
    }

    public double calcularValorConta(double quantidadeKW) {
        return quantidadeKW * valorKW;
    }

    private double obterValorKW(int tipoCliente) {
        switch (tipoCliente) {
            case 1:
                return 0.602;
            case 2:
                return 0.483;
            case 3:
                return 1.29;
            default:
                return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema de cálculo de conta de luz.");
        System.out.println("Por favor, selecione o tipo de cliente:");
        System.out.println("1 - Residência");
        System.out.println("2 - Comércio");
        System.out.println("3 - Indústria");
        int tipoCliente = readIntInput(scanner, 1, 3);

        ContaDeLuz contaDeLuz = new ContaDeLuz(tipoCliente);

        System.out.println("Por favor, digite a quantidade de KW consumidos:");
        double quantidadeKW = readPositiveDoubleInput(scanner);
        
        double valorConta = contaDeLuz.calcularValorConta(quantidadeKW);
        System.out.println("O valor da conta de luz é: R$" + valorConta);
        
        scanner.close();
    }

    private static int readIntInput(Scanner scanner, int min, int max) {
        int input;
        while (true) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= min && input <= max) {
                    break;
                }
            }
            System.out.println("Por favor, digite uma opção válida entre " + min + " e " + max + ":");
            scanner.nextLine();
        }
        return input;
    }

    private static double readPositiveDoubleInput(Scanner scanner) {
        double input;
        while (true) {
            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();
                if (input >= 0) {
                    break;
                }
            }
            System.out.println("Por favor, digite um valor positivo:");
            scanner.nextLine();
        }
        return input;
    }
}

