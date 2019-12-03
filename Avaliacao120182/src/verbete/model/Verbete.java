package br.com.verbete.model;

public class Verbete {
	private String palavra;
	private String descricao;
	private ClasseGramatical classeGramatical;
	private Verbete[] sinonimos;
	
	public Verbete(String palavra, String descricao,
			ClasseGramatical classeGramatical) {
		this.palavra = palavra;
		this.descricao = descricao;
		this.classeGramatical = classeGramatical;
		this.sinonimos = new Verbete[0];
	}
	
	
	public String getPalavra() {
		return palavra;
	}

	public String getDescricao() {
		return descricao;
	}

	public ClasseGramatical getClasseGramatical() {
		return classeGramatical;
	}
	
	public void addVerbete(Verbete verbete) {
		Verbete [] aux = new Verbete[this.sinonimos.length + 1];
		for(int i = 0; i<this.sinonimos.length; i++) {
			aux[i] = this.sinonimos[i];
		}
		aux[aux.length - 1] = verbete;
		this.sinonimos = aux;
	}
	
	public boolean compararPalavra(String palavra) {
		return this.getPalavra().equalsIgnoreCase(palavra);
	}
	
	public boolean calculaEquivalencia(Verbete verbete) {
		return this.equals(verbete) || this.procurarSinonimo(verbete);
	}
	
	public boolean equals(Verbete verbete) {
		return this.getPalavra().equals(verbete.getPalavra())
			&& this.getClasseGramatical().equals(verbete.getClasseGramatical());
	}

	private boolean procurarSinonimo(Verbete verbete) {
		for(Verbete v : this.sinonimos)
			if(v.equals(verbete))
				return true;
		return false;
	}
	
	public void addSinonimo(Verbete verbete) {
		if(this.procurarSinonimo(verbete)) 
			return;
		
		this.addVerbete(verbete);
		verbete.addSinonimo(this);
	}
	
	public boolean compararNome() {
		return 
				this.getClasseGramatical().equals(ClasseGramatical.SUBSTANTIVO) 
				|| this.getClasseGramatical().equals(ClasseGramatical.ADJETIVO)
				|| this.getClasseGramatical().equals(ClasseGramatical.PRONOME);
	}
}
