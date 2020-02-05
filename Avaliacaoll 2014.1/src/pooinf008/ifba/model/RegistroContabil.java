package pooinf008.ifba.model;

public class RegistroContabil {
	private String nome;
	private String cnpj;
	private BalancoContabil balanco;
	private LivroLancamentos livro;
	
	public RegistroContabil(String nome, String cnpj, BalancoContabil balanco, LivroLancamentos livro) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.balanco = balanco;
		this.livro = livro;
	}
	    
    
}
