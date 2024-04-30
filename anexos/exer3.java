import java.util.Scanner;

class Vendedor {
    private String nome;
    private double salarioFixo;
    private double totalVendas;

    public Vendedor(String nome, double salarioFixo, double totalVendas) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.totalVendas = totalVendas;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public double calcularSalarioFinal() {
        double comissao = 0.15 * totalVendas;
        return salarioFixo + comissao;
    }
}

public class exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor:");
        String nomeVendedor = scanner.nextLine();

        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas efetuadas pelo vendedor no mês (em dinheiro):");
        double totalVendas = scanner.nextDouble();

        Vendedor vendedor = new Vendedor(nomeVendedor, salarioFixo, totalVendas);

        double salarioFinal = vendedor.calcularSalarioFinal();

        System.out.println("Nome do vendedor: " + vendedor.getNome());
        System.out.println("Salário fixo do vendedor: R$" + vendedor.getSalarioFixo());
        System.out.println("Salário final do vendedor no final do mês: R$" + salarioFinal);

        scanner.close();
    }
}

