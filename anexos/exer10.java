import java.util.Scanner;

class VerificadorIdade {
    public void verificarIdades() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de pessoas:");
        int numeroPessoas = scanner.nextInt();

        for (int i = 0; i < numeroPessoas; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            int idade = scanner.nextInt();

            if (idadeValida(idade)) {
                if (idade >= 18) {
                    System.out.println("Maior de idade");
                } else {
                    System.out.println("Menor de idade");
                }
            } else {
                System.out.println("Idade inválida. Digite novamente.");
                i--;
            }
        }

        scanner.close();
    }

    private boolean idadeValida(int idade) {
        return idade >= 0;
    }
}

public class exer10 {
    public static void main(String[] args) {
        VerificadorIdade verificador = new VerificadorIdade();
        verificador.verificarIdades();
    }
}
