package br.edu.up;

import java.util.Scanner;

public class Nadador {
    private int idade;

    public Nadador(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String determinarCategoria() {
        String categoria;
        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        } else if (idade >= 18 && idade <= 25) {
            categoria = "Sênior";
        } else {
            categoria = "Idade fora da faixa etária";
        }
        return categoria;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        while (true) {
            System.out.println("Digite a idade do nadador:");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                if (idade >= 5) {
                    break;
                }
            }
            scanner.nextLine();
        }

        Nadador nadador = new Nadador(idade);
        String categoria = nadador.determinarCategoria();
        System.out.println("Categoria do nadador: " + categoria);

        scanner.close();
    }
}

