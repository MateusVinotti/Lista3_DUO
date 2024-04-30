import java.util.Scanner;

class VerificadorAptidaoMilitar {
    private int totalAptos;
    private int totalInaptos;

    public VerificadorAptidaoMilitar() {
        totalAptos = 0;
        totalInaptos = 0;
    }

    public void verificarAptidaoMilitar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de pessoas:");
        int numeroPessoas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numeroPessoas; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo da pessoa " + (i + 1) + " (M/F):");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);
            
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            int idade = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Digite a saúde da pessoa " + (i + 1) + " (Boa/Ruim):");
            String saude = scanner.nextLine().toLowerCase();

            if (sexo == 'M' && idade >= 18 && saude.equals("boa")) {
                System.out.println(nome + " está apto para o serviço militar obrigatório.");
                totalAptos++;
            } else {
                System.out.println(nome + " não está apto para o serviço militar obrigatório.");
                totalInaptos++;
            }
        }

        scanner.close();
    }

    public int getTotalAptos() {
        return totalAptos;
    }

    public int getTotalInaptos() {
        return totalInaptos;
    }
}

public class exer13 {
    public static void main(String[] args) {
        VerificadorAptidaoMilitar verificador = new VerificadorAptidaoMilitar();
        verificador.verificarAptidaoMilitar();
        System.out.println("Total de pessoas aptas: " + verificador.getTotalAptos());
        System.out.println("Total de pessoas inaptas: " + verificador.getTotalInaptos());
    }
}
