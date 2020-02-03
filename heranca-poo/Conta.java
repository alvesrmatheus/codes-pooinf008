public class Conta{
    private Integer numero;
    private String titular;
    private Double saldo;
    
    
    public Conta(){
    }
    
    public Conta(Integer numero, String titular, Double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void sacar(double valor){
        saldo -= valor;
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public Integer getNumero(){
        return this.numero;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public Double getSaldo(){
        return this.saldo;
    }
}
