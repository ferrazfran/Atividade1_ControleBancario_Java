package Conta;

public abstract class Conta {
    protected String numero;
    protected String agencia;
    protected Cliente cliente;
    protected double saldo; 

    public Conta(String numero, String agencia, Cliente cliente){
        this.setAgencia(agencia);
        this.setNumero(numero);
        this.cliente = cliente;
        this.saldo = 0;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero( String numero){
        this.numero = numero;
    }
    
    public String getAgencia(){
        return agencia;
    }
    
    public void setAgencia( String agencia){
        this.agencia = agencia;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente( Cliente cliente){
        this.cliente = cliente;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
     
    public abstract void sacar ();
    
    public String depositar (double valor){
        saldo = saldo + valor;
        return "Depósito realizado com sucesso";
    }
}