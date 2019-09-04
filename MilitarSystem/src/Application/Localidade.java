package Application;

public class Localidade {
	private String nome;
	private RegiaoInfluencia[] regiaoInfluencia;
	//private double valor;
	
	//GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}
	
	public RegiaoInfluencia[] getRegioesInfluencia() {
		return regiaoInfluencia;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}
	
	//--------------------------------------------

	public void addRegionInfluencias(RegiaoInfluencia regiao){
		RegiaoInfluencia[] novo = new RegiaoInfluencia[this.regiaoInfluencia.length + 1];
		for(int i=0; i<this.regiaoInfluencia.length; i++){
			novo[i] = this.regiaoInfluencia[i];	
		}
		novo[novo.length - 1] = regiao;
		this.regiaoInfluencia = novo;
	}
	
	public boolean equals(Localidade l){
		return this.getNome().equals(l.getNome());
	}
	
	public double getInfluencia(Localidade l) {
		for(RegiaoInfluencia r : this.regiaoInfluencia){
			if(r.equals(l))
				return r.getValor();
		}
		return 0;
	}
	
	
	
	
	
}
