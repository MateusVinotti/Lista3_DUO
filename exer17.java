package br.edu.up;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private double salario;
    private static final double AUMENTO_SALARIAL = 1.1;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularNovoSalario() {
        return salario * AUMENTO_SALARIAL;
    }

    public double calcularAumentoFolha() {
        return calcularNovoSalario() - salario;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nomeFuncionario = scanner.nextLine();

        System.out.println("Digite o salário do funcionário:");
        double salarioFuncionario = scanner.nextDouble();

        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nomeFuncionario, salarioFuncionario);
        double novoSalario = funcionario.calcularNovoSalario();
        double aumentoFolha = funcionario.calcularAumentoFolha();

        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Reajuste: " + aumentoFolha);
        System.out.println("Novo salário: " + novoSalario);
        System.out.println("Aumento na folha de pagamento: " + aumentoFolha);

        scanner.close();
    }
}

