public class RegistroContabil{
    private String nome;
    private long cnpj;
    private BalancoContabil balanco;
    private LivroLancamentos livro;
    
    public RegistroContrabil(String nome, long cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
        this.balanco = new BalancoContabil();
        this.livro = new LivroLancamentos();
    }
}
