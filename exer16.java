package br.edu.up;

import java.util.Scanner;

public class Funcionario {
    private static final double SALARIO_MINIMO = 1100.00;
    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double calcularNovoSalario() {
        if (salario < 3 * SALARIO_MINIMO) {
            return salario * 1.5;
        } else if (salario >= 3 * SALARIO_MINIMO && salario <= 10 * SALARIO_MINIMO) {
            return salario * 1.2;
        } else if (salario > 10 * SALARIO_MINIMO && salario <= 20 * SALARIO_MINIMO) {
            return salario * 1.15;
        } else {
            return salario * 1.1;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TOTAL_FUNCIONARIOS = 584;
        
        int funcionariosAte3Salarios = 0;
        int funcionariosEntre3e10Salarios = 0;
        int funcionariosEntre10e20Salarios = 0;
        int outrosFuncionarios = 0;
        
        for (int i = 0; i < TOTAL_FUNCIONARIOS; i++) {
            double salario = scanner.nextDouble();
            
            Funcionario funcionario = new Funcionario(salario);
            double novoSalario = funcionario.calcularNovoSalario();
            
            if (salario < 3 * Funcionario.SALARIO_MINIMO) {
                funcionariosAte3Salarios++;
            } else if (salario >= 3 * Funcionario.SALARIO_MINIMO && salario <= 10 * Funcionario.SALARIO_MINIMO) {
                funcionariosEntre3e10Salarios++;
            } else if (salario > 10 * Funcionario.SALARIO_MINIMO && salario <= 20 * Funcionario.SALARIO_MINIMO) {
                funcionariosEntre10e20Salarios++;
            } else {
                outrosFuncionarios++;
            }   
            System.out.println(novoSalario);
        }
        System.out.println(funcionariosAte3Salarios);
        System.out.println(funcionariosEntre3e10Salarios);
        System.out.println(funcionariosEntre10e20Salarios);
        System.out.println(outrosFuncionarios); 
        scanner.close();
    }
}

