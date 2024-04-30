package br.edu.up;

import java.util.Scanner;

public class Produto {
    private double precoCusto;
    private double precoVenda;

    public Produto(double precoCusto, double precoVenda) {
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public String verificarLucro() {
        if (precoVenda > precoCusto) {
            return "Lucro";
        } else if (precoVenda < precoCusto) {
            return "Prejuízo";
        } else {
            return "Empate";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrecoCusto = 0;
        double totalPrecoVenda = 0;
        System.out.println("Digite o preço de custo e o preço de venda dos 40 produtos:");
        for (int i = 0; i < 40; i++) {
            System.out.println("Produto " + (i + 1) + ":");
            System.out.println("Preço de custo:");
            double precoCusto = scanner.nextDouble();
            
            System.out.println("Preço de venda:");
            double precoVenda = scanner.nextDouble();
            
            Produto produto = new Produto(precoCusto, precoVenda);
            totalPrecoCusto += produto.getPrecoCusto();
            totalPrecoVenda += produto.getPrecoVenda();
            
            System.out.println("Produto " + (i + 1) + ": " + produto.verificarLucro());
        }
        double mediaPrecoCusto = totalPrecoCusto / 40;
        double mediaPrecoVenda = totalPrecoVenda / 40;
        System.out.println("Média de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);
        scanner.close();
    }
}

