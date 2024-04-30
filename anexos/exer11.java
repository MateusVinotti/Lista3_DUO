import java.util.Scanner;

class ContadorSexo {
    private int totalHomens;
    private int totalMulheres;

    public ContadorSexo() {
        totalHomens = 0;
        totalMulheres = 0;
    }

    public void contarSexo() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 56; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = scanner.nextLine();

            char sexo;
            do {
                System.out.println("Digite o sexo da pessoa " + (i + 1) + " (M para masculino, F para feminino):");
                sexo = scanner.nextLine().toUpperCase().charAt(0);

                if (sexo != 'M' && sexo != 'F') {
                    System.out.println("Sexo inválido. Digite novamente.");
                }
            } while (sexo != 'M' && sexo != 'F');

            if (sexo == 'M') {
                System.out.println(nome + " é homem");
                totalHomens++;
            } else {
                System.out.println(nome + " é mulher");
                totalMulheres++;
            }
        }
        scanner.close();
    }

    public int getTotalHomens() {
        return totalHomens;
    }

    public int getTotalMulheres() {
        return totalMulheres;
    }
}

public class exer11 {
    public static void main(String[] args) {
        ContadorSexo contador = new ContadorSexo();
        contador.contarSexo();
        System.out.println("Total de homens: " + contador.getTotalHomens());
        System.out.println("Total de mulheres: " + contador.getTotalMulheres());
    }
}
