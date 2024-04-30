package br.edu.up;

import java.util.Scanner;

public class Professor {
    private double horasTrabalhadas;
    private int nivel;
    private static final double[] VALOR_HORA = {0, 12.00, 17.00, 25.00};

    public Professor(double horasTrabalhadas, int nivel) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.nivel = nivel;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public int getNivel() {
        return nivel;
    }

    public double calcularSalario() {
        double valorHora = VALOR_HORA[nivel];
        return horasTrabalhadas * valorHora;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double horasTrabalhadas;
        while (true) {
            System.out.println("Digite o número de horas trabalhadas:");
            if (scanner.hasNextDouble()) {
                horasTrabalhadas = scanner.nextDouble();
                if (horasTrabalhadas >= 0) {
                    break;
                }
            }
            scanner.nextLine();
        }

        int nivel;
        while (true) {
            System.out.println("Digite o nível do professor (1 a 3):");
            if (scanner.hasNextInt()) {
                nivel = scanner.nextInt();
                if (nivel >= 1 && nivel <= 3) {
                    break;
                }
            }
            scanner.nextLine();
        }

        Professor professor = new Professor(horasTrabalhadas, nivel);
        double salario = professor.calcularSalario();
        System.out.println("O salário do professor é: R$" + salario);

        scanner.close();
    }
}

