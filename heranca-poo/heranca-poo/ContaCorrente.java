public class ContaCorrente{
    private int numero;
    private String titular;
    private double saldo;
    
    public ContaCorrente(){
    }
    
    public ContaCorrente(Integer numero, String titular, Double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
        public int getNumero(){
        return this.numero;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void sacar(double valor){
        saldo -= valor;
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public void transferir(double valor, ContaCorrente contaDestino){
        if(this.getSaldo()!=0.0 &&
            this.getSaldo() >= valor)
            this.sacar(valor);    
        contaDestino.depositar(valor);
    }
    
}
