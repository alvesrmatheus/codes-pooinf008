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
    
    public void setFuncao(TipoDeConta valor){
        this.funcao = valor;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
}
