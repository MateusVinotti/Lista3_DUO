import java.util.Scanner;

class Automovel {
    private double distanciaPercorrida;
    private double combustivelGasto;

    public Automovel(double distanciaPercorrida, double combustivelGasto) {
        this.distanciaPercorrida = distanciaPercorrida;
        this.combustivelGasto = combustivelGasto;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public double getCombustivelGasto() {
        return combustivelGasto;
    }

    public double calcularConsumoMedio() {
        if (combustivelGasto == 0) {
            return 0; // Evitar divisão por zero
        }
        return distanciaPercorrida / combustivelGasto;
    }
}

public class exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância total percorrida pelo automóvel (em km):");
        double distanciaPercorrida = scanner.nextDouble();

        System.out.println("Digite o total de combustível gasto (em litros):");
        double combustivelGasto = scanner.nextDouble();

        Automovel automovel = new Automovel(distanciaPercorrida, combustivelGasto);

        double consumoMedio = automovel.calcularConsumoMedio();

        System.out.println("O consumo médio do automóvel é: " + consumoMedio + " km/l");

        scanner.close();
    }
}

