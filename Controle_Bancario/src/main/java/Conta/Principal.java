package Conta;

public class Principal {
    public static void main(String args[]){
        Cliente cliente = new Cliente("Igor", "123.456.789-10");
        Corrente corrente = new Corrente("012345-6", "0001", cliente);
        Poupanca poupanca = new Poupanca("012345-6", "0002", cliente);
                
        System.out.println("Conta Corrente:" + "\nCliente: "+corrente.cliente.getNome() +"\nCPF: "+corrente.cliente.getCpf() + "\nAgencia: "+corrente.agencia + "\nNumero da Conta:" +corrente.numero);
        
        
        corrente.depositar(1000);
        corrente.sacar();
        
        System.out.println("Saldo da conta corrente:"+corrente.saldo);
        
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("Conta Poupança:" + "\nCliente: "+poupanca.cliente.getNome() +"\nCPF: "+poupanca.cliente.getCpf() + "\nAgencia: "+poupanca.agencia + "\nNumero da Conta:" +poupanca.numero);

        
        poupanca.depositar(1500);
        poupanca.sacar();
        
        System.out.println("Saldo da conta poupança:"+poupanca.saldo);

    }
}