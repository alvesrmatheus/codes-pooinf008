public class Conta{
    private String nome;
    protected double saldo;
    
    public Conta(){}
    
    /*public Conta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }*/
    
    public String getNome(){
        return this.nome;
    }   
    
    public void creditar(double valor){
    }    
    
    public void debitar(double valor){
    }    
}
