public class RegistroContabil{
    private String nome;
    private String cnpj;
    private BalancoContabil balanco;
    private LivroLancamentos livro;
    
    public RegistroContabil(String nome, String cnpj){
        this.setNome(nome);
        this.setCNPJ(cnpj);
    }
    
    private void setNome(String nome){
        this.nome = nome;
    }
    
    private void setCNPJ(String cnpj){
        this.cnpj = cnpj;
    }
    
    public void registrarFato(String descricao, String nomeCredito,
                            String nomeDebito, double valor){
        Conta credito = balanco.buscarConta(nomeCredito); 
        Conta debito = balanco.buscarConta(nomeDebito); 
        Lancamento lancamento = new Lancamento(descricao, valor, credito, debito);
        this.livro.addRegistro(lancamento);
        this.balanco.ajustar(nomeCredito, nomeDebito, valor);
  }    
}
