package ifba.ads.inf008.model;

public class Via {
	private Logradouro tipo;
	private String nome;
	private double extensao;
	private double velMax;
	private double[] velocidades = new double[24];
	private Via[] adjacentes;
	
	public Via(Logradouro tipo, String nome, double extensao, double velMax){
		this.tipo = tipo;
		this.nome = nome;
		this.extensao = extensao;
		this.setVelocidades(velMax);
		this.adjacentes = new Via[0];
	}
	
	private void setVelocidades(double velMax){
		for(int i=0; i<this.velocidades.length; i++)
			this.velocidades[i] = velMax;
	}
	
	public double getTempoMedio(int hora){
		return this.getExtensao()/
				this.getVelocidades(hora);
	}
	
	public double getVelocidades(int hora){
		return this.velocidades[hora];
	}
	
	public boolean equals(Via via){
		return this.getNome().equals(via.getNome())
				&& this.getTipo().equals(via.getTipo());
	}
	
	public boolean isAdjacente(Via via){
		for(Via v : this.adjacentes)
			if(v.equals(via))
				return true;
		return false;
	}
	
	private void setTipo(Logradouro tipo) {
		this.tipo = tipo;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private void setExtensao(double extensao) {
		this.extensao = extensao;
	}

	private void setVelMax(double velMax) {
		this.velMax = velMax;
	}

	private void setAdjacentes(Via[] adjacentes) {
		this.adjacentes = adjacentes;
	}

	public Logradouro getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

	public double getExtensao() {
		return extensao;
	}

	public double getVelMax() {
		return velMax;
	}	
	
	public double[] getVelocidades() {
		return this.velocidades;
	}
	
}
