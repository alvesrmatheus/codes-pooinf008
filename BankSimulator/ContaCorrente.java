public class ContaCorrente{
    
    private String id;
    double saldo;
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public String getId(){
        return this.id;
    }
    
    private void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void depositar(double saldoAtual){
        this.saldo += saldoAtual;
    }
    
    public void sacar(double saque){
        if(saque <= this.saldo)
            this.saldo -= saque;
    }
    
    public boolean equals(ContaCorrente cc){
        return this.getId().equals(cc.id);
    }
    
    //public String toString(){}
        
    
}
