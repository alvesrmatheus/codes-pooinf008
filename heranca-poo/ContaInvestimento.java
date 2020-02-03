public class ContaInvestimento extends Conta{
    private double limite;
    
    public ContaInvestimento(){
        super();
    }
    
    public ContaInvestimento(Integer numero, String titular,
        Double saldo, Double limite){
        super(numero, titular, saldo);
        this.limite = limite;
    }
    
    public double getLimite(){
        return this.limite;
    }
    
    public void Emprestar(double valor){
        if(valor <= this.getLimite());
            depositar(valor);
    }
}
