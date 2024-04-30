import java.util.Scanner;

class VerificadorNumeros {
    private int quantidadeNumerosNoIntervalo;

    public VerificadorNumeros() {
        quantidadeNumerosNoIntervalo = 0;
    }

    public void verificarNumeros() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 80 números:");
        for (int i = 0; i < 80; i++) {
            int numero = scanner.nextInt();
            if (numero >= 10 && numero <= 150) {
                quantidadeNumerosNoIntervalo++;
            }
        }

        scanner.close();
    }

    public int getQuantidadeNumerosNoIntervalo() {
        return quantidadeNumerosNoIntervalo;
    }
}

public class exer9 {
    public static void main(String[] args) {
        VerificadorNumeros verificador = new VerificadorNumeros();
        verificador.verificarNumeros();
        System.out.println("Quantidade de números no intervalo [10, 150]: " + verificador.getQuantidadeNumerosNoIntervalo());
    }
}
