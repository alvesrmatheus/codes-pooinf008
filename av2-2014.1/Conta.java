public abstract class Conta implements Ordenavel{
    private String id;
    private String nome;
    protected double saldo;
    
    public Conta(){}
    
    public Conta(String nome){
        this.setNome(nome);
        this.saldo = 0.0;
    }
    
    public String getId(){
        return this.id;
    }
    
    private void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }   
    
    public abstract void creditar(double valor);
    
    public abstract void debitar(double valor);   
    
    public int compare(Ordenavel outro){
        if(!(outro instanceof Conta))
            return 0;
        Conta c = (Conta)outro;
        return this.getId().compareTo(c.getId());    
    }
}
