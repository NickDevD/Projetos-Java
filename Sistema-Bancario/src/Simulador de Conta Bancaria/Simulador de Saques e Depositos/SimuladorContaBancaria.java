import java.util.Scanner;

public class SimuladorContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;

        while (true) {

            int operacao = scanner.nextInt();

            switch (operacao) {
                case 1:
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double valorSaque = scanner.nextDouble();
                    if (saldo >= valorSaque) {
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    return;
                default:
                    System.out.println("Operação inválida. Tente novamente.");
            }
        }
    }
}
