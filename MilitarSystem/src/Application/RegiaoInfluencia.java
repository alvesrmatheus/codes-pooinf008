package Application;

public class RegiaoInfluencia {
	private double valor;
	private Localidade localidade;

	public RegiaoInfluencia(Localidade localidade, double valor){
        this.setLocalidade(localidade);
        this.setValor(valor);
    }  
	
	//GETTERS AND SETTERS
	public double getValor() {
		// TODO Auto-generated method stub
		return this.valor;
	}
	
	public Localidade getLocalidade() {
		return localidade;
	}
	
	public void setLocalidade(Localidade localidade) {
		this.localidade = localidade;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	//-----------------------------
	
	public boolean equals(Localidade l){
		return this.localidade.equals(l);
	}
}
