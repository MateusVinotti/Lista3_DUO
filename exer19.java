package br.edu.up;

import java.util.Scanner;

public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public boolean isTriangulo() {
        return (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2);
    }

    public String tipoTriangulo() {
        if (isTriangulo()) {
            if (lado1 == lado2 && lado2 == lado3) {
                return "Triângulo Equilátero";
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                return "Triângulo Isósceles";
            } else {
                return "Triângulo Escaleno";
            }
        } else {
            return "Os valores não formam um triângulo.";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lado1, lado2, lado3;
        while (true) {
            try {
                System.out.println("Digite o tamanho dos três lados do triângulo:");
                lado1 = Integer.parseInt(scanner.nextLine());
                lado2 = Integer.parseInt(scanner.nextLine());
                lado3 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {}
        }

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        System.out.println(triangulo.tipoTriangulo());

        scanner.close();
    }
}

