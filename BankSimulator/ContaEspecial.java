public class ContaEspecial extends ContaCorrente{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double limite;
    
    public void setLimite(double limite){
        this.limite = limite;
    }
    
    public void sacar(double saque){
        if(saque <= this.saldo + this.limite)
            this.saldo -= saque;
    }

}
