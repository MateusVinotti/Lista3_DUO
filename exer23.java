package br.edu.up;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private char sexo;
    private double altura;
    private int idade;

    public Pessoa(String nome, char sexo, double altura, int idade) {
        this.nome = nome;
        this.sexo = Character.toUpperCase(sexo);
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public double calcularPesoIdeal() {
        if (sexo == 'M') {
            if (altura > 1.70) {
                if (idade <= 20) {
                    return 72.7 * altura - 58;
                } else if (idade >= 21 && idade <= 39) {
                    return 72.7 * altura - 53;
                } else {
                    return 72.7 * altura - 45;
                }
            } else {
                if (idade <= 40) {
                    return 72.7 * altura - 50;
                } else {
                    return 72.7 * altura - 58;
                }
            }
        } else {
            if (altura > 1.50) {
                if (idade >= 35) {
                    return 62.1 * altura - 45;
                } else {
                    return 62.1 * altura - 44.7;
                }
            } else {
                if (idade >= 35) {
                    return 62.1 * altura - 45;
                } else {
                    return 62.1 * altura - 49.7;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();
        char sexo = readGenderInput(scanner);
        double altura = readHeightInput(scanner);
        int idade = readAgeInput(scanner);

        Pessoa pessoa = new Pessoa(nome, sexo, altura, idade);
        double pesoIdeal = pessoa.calcularPesoIdeal();

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Peso ideal: " + pesoIdeal + " kg");

        scanner.close();
    }

    private static char readGenderInput(Scanner scanner) {
        char sexo;
        while (true) {
            System.out.println("Digite o sexo da pessoa (M/F):");
            sexo = Character.toUpperCase(scanner.next().charAt(0));
            if (sexo == 'M' || sexo == 'F') {
                break;
            }
            System.out.println("Por favor, digite 'M' para masculino ou 'F' para feminino:");
        }
        return sexo;
    }

    private static double readHeightInput(Scanner scanner) {
        double altura;
        while (true) {
            System.out.println("Digite a altura da pessoa em metros:");
            if (scanner.hasNextDouble()) {
                altura = scanner.nextDouble();
                if (altura > 0) {
                    break;
                }
            }
            System.out.println("Por favor, digite uma altura válida:");
            scanner.nextLine();
        }
        return altura;
    }

    private static int readAgeInput(Scanner scanner) {
        int idade;
        while (true) {
            System.out.println("Digite a idade da pessoa:");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                if (idade >= 0) {
                    break;
                }
            }
            System.out.println("Por favor, digite uma idade válida:");
            scanner.nextLine();
        }
        return idade;
    }
}

