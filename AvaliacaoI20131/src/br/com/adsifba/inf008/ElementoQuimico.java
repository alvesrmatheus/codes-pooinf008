package br.com.adsifba.inf008;

public class ElementoQuimico {
	private String nome;
	private int numeroAtomico;
	private int massaAtomica;
	private int[] qtdEletrons;
	
	public ElementoQuimico(String nome, int numAtomico, int massa) {
		this.nome = nome;
		this.numeroAtomico = numAtomico;
		this.massaAtomica = massa;
		this.qtdEletrons = new int[7];
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getNumeroAtomico() {
		return this.numeroAtomico;
	}
	
	public boolean equals(ElementoQuimico elemQ) {
		return this.getNumeroAtomico() == elemQ.getNumeroAtomico();
	}
	
	public int[] getEletrons() {
		return this.qtdEletrons;
	}
	
}
