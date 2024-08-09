

public class Execucao {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupança();


        cc.imprimirExtrato();
        cc.depositar(10);
        cc.transferir(10, cp);
        cc.imprimirExtrato();


        cp.imprimirExtrato();
    }
}
