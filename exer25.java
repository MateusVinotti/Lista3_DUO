package br.edu.up;

import java.util.Scanner;

public class Estudante {
    private String nome;
    private int matricula;
    private double notaLaboratorio;
    private double notaAvaliacao;
    private double notaExameFinal;

    public Estudante(String nome, int matricula, double notaLaboratorio, double notaAvaliacao, double notaExameFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacao = notaAvaliacao;
        this.notaExameFinal = notaExameFinal;
    }

    public double calcularNotaFinal() {
        return (notaLaboratorio * 2 + notaAvaliacao * 3 + notaExameFinal * 5) / 10;
    }

    public String calcularClassificacao() {
        double notaFinal = calcularNotaFinal();
        if (notaFinal >= 8 && notaFinal <= 10) {
            return "A";
        } else if (notaFinal >= 7 && notaFinal < 8) {
            return "B";
        } else if (notaFinal >= 6 && notaFinal < 7) {
            return "C";
        } else if (notaFinal >= 5 && notaFinal < 6) {
            return "D";
        } else {
            return "R";
        }
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNotaLaboratorio() {
        return notaLaboratorio;
    }

    public double getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public double getNotaExameFinal() {
        return notaExameFinal;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do estudante:");
        String nome = scanner.nextLine();

        System.out.println("Informe o número de matrícula do estudante:");
        int matricula = scanner.nextInt();

        System.out.println("Informe as notas do estudante:");
        double notaLaboratorio = lerNota(scanner, "trabalho de laboratório");
        double notaAvaliacao = lerNota(scanner, "avaliação semestral");
        double notaExameFinal = lerNota(scanner, "exame final");

        Estudante estudante = new Estudante(nome, matricula, notaLaboratorio, notaAvaliacao, notaExameFinal);
        double notaFinal = estudante.calcularNotaFinal();
        String classificacao = estudante.calcularClassificacao();

        System.out.println("--------------------------");
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Matrícula: " + estudante.getMatricula());
        System.out.println("Nota Final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }

    private static double lerNota(Scanner scanner, String tipoNota) {
        double nota;
        while (true) {
            System.out.println("Digite a nota do " + tipoNota + " (0 a 10):");
            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    break;
                }
            }
            System.out.println("Por favor, digite uma nota válida (entre 0 e 10).");
            scanner.nextLine();
        }
        return nota;
    }
}

