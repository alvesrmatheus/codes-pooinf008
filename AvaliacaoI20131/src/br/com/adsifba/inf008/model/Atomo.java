package br.com.adsifba.inf008.model;
//Parte 1
public class Atomo {
	//i
	private String nome;
	private int numeroAtomico;
	private int massaAtomica;
	private int[] qtdEletrons;
	//ii
	public Atomo(String nome, int numAtomico, int massa) {
		this.nome = nome;
		this.numeroAtomico = numAtomico;
		this.massaAtomica = massa;
		this.qtdEletrons = new int[7];
	}
	
	public String getNome() {
		return this.nome;
	}
	//iii
	public int getNumeroAtomico() {
		return this.numeroAtomico;
	}
	//iv
	public boolean equals(Atomo elemQ) {
		return this.getNumeroAtomico() == elemQ.getNumeroAtomico();
	}
	//v
	public int[] getEletrons() {
		return this.qtdEletrons;
	}
	
}
