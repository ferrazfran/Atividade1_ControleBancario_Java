package Conta;

public class Poupanca extends Conta{
    
     public Poupanca(String numero, String agencia, Cliente cliente) {
		super(numero, agencia, cliente);
	}

	@Override
    public void sacar() {
        double valor;
         valor = 200;
         if(valor>saldo){
            System.out.println("Saldo insuficiente para realizar o saque");
         }
         else{
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso");
         }
    }
}
