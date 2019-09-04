package Application;

public class RegiaoInfluencia {
	private double valor;
	private Localidade localidade;

	
	//GETTERS AND SETTERS
	public double getValor() {
		// TODO Auto-generated method stub
		return this.valor;
	}
	
	public Localidade getLocalidade() {
		return localidade;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	//-----------------------------
	
	public boolean equals(Localidade l){
		return this.localidade.equals(l);
	}
}
