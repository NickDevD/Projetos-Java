
// Interfaces são contratos que possuem métodos abstratos
// por padrão e públicos, também.
// Todas as classes que implementarem uma interface irão
// implementar seus métodos obrigatoriamente

public interface IConta {


    // métodos públicos da interface
    // com parêmetros
     void sacar(double valor);

     void depositar(double valor);

     void transferir(double valor, Conta ContaDestino);

     void imprimirExtrato();
}
