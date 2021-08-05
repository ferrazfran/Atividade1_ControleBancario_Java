package Conta;

public class Corrente extends Conta{   

    public Corrente(String numero, String agencia, Cliente cliente) {
		super(numero, agencia, cliente);
	}

	@Override
    public void sacar() {
        double valor;
        valor = 500;
        if(valor>saldo){
           System.out.println("Saldo insuficiente para realizar o saque");
        }
        else{
           saldo = saldo - 0.10;
           saldo = saldo - valor;
           System.out.println("Saque realizado com sucesso");
        }
    }
}