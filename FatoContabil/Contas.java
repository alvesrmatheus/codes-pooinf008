public class Contas{
    private String nomeConta;
    private double saldo;
    private TipoDeConta funcao;
    
    public Contas(){
    }
    
    public Contas(String nome, double saldo, TipoDeConta funcao){
        this.nomeConta = nome;
        this.saldo = saldo;
        this.funcao = funcao;
    }
    
    public String getNomeConta(){
        return this.nomeConta;
    }
    
    public void setNomeConta(String nome){
        this.nomeConta = nome;
    }
    
    public TipoDeConta getFuncao(){
        return this.funcao;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void debito(double montante){
        if(this.funcao.equals(getFuncao().CONTA_DE_ATIVO)){
            saldo += montante;
        }
        
        return;
    }
    
    public void credito(double montante){
        if(this.funcao.equals(getFuncao().CONTA_DE_PASSIVO) 
            || this.funcao.equals(getFuncao().PATRIMONIO_LIQUIDO)){
            saldo -= montante;
        }
        
        return;
    }
}
