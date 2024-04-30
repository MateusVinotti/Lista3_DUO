import java.util.Scanner;

class Produto {
    private double precoCusto;
    private double percentualAcrescimo;

    public Produto(double precoCusto, double percentualAcrescimo) {
        this.precoCusto = precoCusto;
        this.percentualAcrescimo = percentualAcrescimo;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPercentualAcrescimo() {
        return percentualAcrescimo;
    }

    public double calcularPrecoVenda() {
        double acrescimo = precoCusto * (percentualAcrescimo / 100);
        return precoCusto + acrescimo;
    }
}

public class exer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço de custo do produto:");
        double precoCusto = scanner.nextDouble();

        System.out.println("Digite o percentual de acréscimo (em %):");
        double percentualAcrescimo = scanner.nextDouble();

        Produto produto = new Produto(precoCusto, percentualAcrescimo);

        double precoVenda = produto.calcularPrecoVenda();

        System.out.println("O preço de venda do produto é: R$" + precoVenda);

        scanner.close();
    }
}
