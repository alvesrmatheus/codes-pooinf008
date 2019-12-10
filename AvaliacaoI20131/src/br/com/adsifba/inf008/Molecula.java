package br.com.adsifba.inf008;

public class Molecula {
	private ElementoQuimico[] elemQ;
	
	public Molecula() {
		this.elemQ = new ElementoQuimico[0];
	}
	
	public ElementoQuimico buscaMenor() {
		for(int i=0; i<this.elemQ.length; i++) {
			for(int j=0; j<this.elemQ.length; j++) {
				if(this.elemQ[i].getNumeroAtomico() < this.elemQ[j].getNumeroAtomico())
					return this.elemQ[i];
				else 
					return this.elemQ[j];
			}
		}
		return null;
	}
	
	public int qtdAtomosExistentes() {
		return 0;
	}
}
