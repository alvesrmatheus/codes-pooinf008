package Application;

public class Exercito {
	private UnidadeCombate[] unidadeCombate;
	
	public Exercito() {
		this.unidadeCombate = new UnidadeCombate[0];
 	}
	
	//GETTERS AND SETTERS
	public UnidadeCombate[] getUnidadeCombate() {
		return unidadeCombate;
	}
	
	public void setUnidadeCombate(UnidadeCombate[] unidadeCombate) {
		this.unidadeCombate = unidadeCombate;
	}
	
	
	public void add(UnidadeCombate uc) {
		UnidadeCombate[] novo = new UnidadeCombate[this.unidadeCombate.length + 1];
		for(int i=0; i<this.unidadeCombate.length; i++) 
			novo[i] = this.unidadeCombate[i];
		novo[novo.length - 1] = uc;
		this.unidadeCombate = novo;
	}
	

	public double potenciaRelativa(Localidade localidade) {
		double potencia = 0.0;
		for(UnidadeCombate uc : this.unidadeCombate)
			potencia += uc.potenciaRelativa(localidade);
		return potencia;
	}

	
}
