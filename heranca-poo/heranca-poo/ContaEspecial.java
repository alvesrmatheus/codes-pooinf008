public class ContaEspecial extends ContaCorrente{
    private double limite;
    
    public ContaEspecial(){
        super();
    }
    
    public ContaEspecial(Integer numero, String titular,
        Double saldo, double limite){
        super(numero, titular, saldo);
        setLimite(limite);
    }
    
    public double getLimite(){
        return this.limite;
    }
    
    private void setLimite(double limite){
        this.limite = limite;
    }
    
    public void emprestimo(double valor){
        if(valor <= this.getLimite())
            depositar(valor);
    }
}
