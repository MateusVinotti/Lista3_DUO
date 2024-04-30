import java.util.Scanner;

class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String obterMencao() {
        double media = calcularMedia();
        if (media >= 7) {
            return "Aprovado";
        } else if (media < 5) {
            return "Reprovado";
        } else {
            return "Recuperação";
        }
    }
}

public class exer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite as três notas obtidas pelo aluno:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Menção: " + aluno.obterMencao());

        scanner.close();
    }
}
