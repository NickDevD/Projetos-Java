import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Verificar se a idade do cliente
        if(scanner.nextInt() >= 18){
          System.out.println("Você está elegível para criar sua conta bancária");
        }else{
          System.out.println("Você não está elegível para criar uma conta bancária");
        }
        // TODO: Se >= 18, imprimir "Voce esta elegivel para criar uma conta bancaria."
        // TODO: Caso contrário, imprimir "Voce nao esta elegivel para criar uma conta bancaria."

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}