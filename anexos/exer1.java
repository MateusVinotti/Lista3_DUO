import java.util.Scanner;

class Aluno {
    private String nome;
    private double[] notas;
    
    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double[] getNotas() {
        return notas;
    }
    
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}

public class exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno:");
        String nomeAluno = scanner.nextLine();
        
        double[] notas = new double[3];
        
        System.out.println("Digite as notas das três provas:");
        for (int i = 0; i < 3; i++) {
            notas[i] = scanner.nextDouble();
        }
        
        Aluno aluno = new Aluno(nomeAluno, notas);
        
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Média do aluno: " + aluno.calcularMedia());
        
        scanner.close();
    }
}

