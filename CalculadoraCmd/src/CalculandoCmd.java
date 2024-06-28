import java.util.Scanner;

public class CalculandoCmd {

    public static void main(String[] args) {

        //objeto scanner
        Scanner scan = new Scanner(System.in);

        //objetos com parametros do tipo (string)
        //utilizando construtor com parâmetro determinado
        CalculadoraCmd text1 = new CalculadoraCmd("Digite o seu nome:");
        CalculadoraCmd text2 = new CalculadoraCmd("Qual operação deseja realizar? " +
                "1 - Soma " +
                "2 - Subtracao " +
                "3 - Multiplicacao " +
                "4 - Divisao ");





        System.out.println(text1.texto);
        text1.texto = scan.next();
        System.out.println(text2.texto);

            //estrutura condicional (switch-case) utilizada para comparar a alteração de variáveis
            //no caso a variável foi scan.nextInt()
            //cada variável tem uma opção de escolha determinada por um número de 1 a 4
            switch (scan.nextInt()){
                case 1:
                    System.out.println("Operação, soma, foi escolhida! " +
                        "Digite o primeiro numero que deseja somar: ");
                    int som1 = scan.nextInt();
                    System.out.println("Deseja somar com qual numero? ");
                    int som2 = scan.nextInt();
                    int soma = som1 + som2;
                    System.out.println("O resultado da soma é:" + soma);
                    break;
                case 2:
                    System.out.println("Operação, subtracao, foi escolhida! " +
                        "Digite o primeiro numero que deseja subtrair: ");
                        break;
                case 3:
                    System.out.println("Operação, multiplicação, foi escolhida" +
                            "Digite o primeiro numero que deseja multiplicar: ");
                            break;
                case 4:
                    System.out.println("Operação, divisão, foi escolhida" +
                            "Digite o primeiro numero que deseja dividir: ");
                            break;
            }




    }
}
