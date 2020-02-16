package aula129.model;

import aula129.model.enums.Cor;

public abstract class Forma {
	private Cor cor;
	
	public Forma(){}
	
	public Forma(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor(){
		return this.cor;
	}

	public abstract double calcularArea();
	
}
