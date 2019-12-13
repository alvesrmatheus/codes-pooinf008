package br.com.adsifba.inf008.model;
//Parte 2
public class Molecula {
	//i
	private Atomo[] atomos;
	
	public Molecula() {
		this.atomos = new Atomo[0];
	}
	//ii
	public Atomo getMenorNumeroAtomico() {
		if(this.atomos.length == 0) 
			return null;
		Atomo menor = this.atomos[0];
		for(Atomo a : this.atomos) 
			menor = buscaMenor(a, menor);
		
		return menor;
	}
	
	private Atomo buscaMenor(Atomo atual, Atomo menor){
		if(atual.getNumeroAtomico() < menor.getNumeroAtomico())
			menor = atual;
		return menor;	
	}
	//iii
	public int qtdAtomosExistentes(Atomo atomo) {
		if()
		return 0;
	}
}
