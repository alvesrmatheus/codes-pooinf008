public class RegistroContabil{
    private String nome;
    private long cnpj;
    private BalancoContabil balanco;
    private LivroLancamentos livro;
    
    public void registrarFato(String descricao, String nomeCredito,
                            String nomeDebito, double valor){
        Conta credito = balanco.buscarConta(nomeCredito); 
        Conta debito = balanco.buscarConta(nomeDebito); 
        Lancamento lancamento = new Lancamento(descricao, valor, credito, debito);
        this.livro.addRegistro(lancamento);
        this.balanco.ajustar(nomeCredito, nomeDebito, valor);
  }    
}
