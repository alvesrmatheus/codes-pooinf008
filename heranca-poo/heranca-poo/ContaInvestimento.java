public class ContaInvestimento extends ContaCorrente{
    
    public ContaInvestimento(String titular, int numero, double saldo){
        super(numero, titular, saldo);
    }
    
    public void depositar(double valor){
        super.depositar(this.getSaldo() + (0.5 * valor));//Taxa 0.5% por deposito
    }
    
    public void investir(double valor){
        //TODO
    }
}
