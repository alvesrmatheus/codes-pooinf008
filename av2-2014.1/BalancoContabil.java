public class BalancoContabil{
    private Conta[] contas;
    
    public Conta buscarConta(String nome){
        for(Conta conta : this.contas)
          if(conta.getNome().equals(nome))
            return conta;
        return null;
    }  
    
    public void ajustar(String nomeCredito, String nomeDebito, 
                        double valor){
      this.buscarConta(nomeCredito).creditar(valor);
      this.buscarConta(nomeDebito).debitar(valor);      
    }    
}
