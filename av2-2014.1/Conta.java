public abstract class Conta{
    private String nome;
    protected double saldo;
    
    public Conta(){}
    
    public Conta(String nome){
        this.setNome(nome);
        this.saldo = 0.0;
    }
    
    private void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }   
    
    public abstract void creditar(double valor){
    }    
    
    public abstract void debitar(double valor){
    }    
}
