package Application;

public class SistemaEstrategiaMilitar {
	private Exercito[] aliados;
	private Exercito[] inimigos;
	private Localidade[] localidades;
	
	public SistemaEstrategiaMilitar() {
		this.aliados = new Exercito[0];
		this.inimigos = new Exercito[0];
		this.localidades = new Localidade[0];
	}
	
	//GET AND SET
	public Exercito[] getAliados() {
		return aliados;
	}
	
	public void setAliados(Exercito[] aliados) {
		this.aliados = aliados;
	}
	
	public Exercito[] getInimigos() {
		return inimigos;
	}
	
	public void setInimigos(Exercito[] inimigos) {
		this.inimigos = inimigos;
	}
	
	public Localidade[] getLocalidades() {
		return localidades;
	}
	
	public void setLocalidades(Localidade[] localidades) {
		this.localidades = localidades;
	}
	//------------------------------------------------------
	
	public void addAliados(Exercito aliado) {
		Exercito[] novo = new Exercito[this.aliados.length + 1];
		for(int i=0; i< this.aliados.length; i++)
			novo[i] = this.aliados[i];
		
		novo[novo.length-1] = aliado;
		this.aliados = novo;
	}
	

	public void addInimigos(Exercito inimigo) {
		Exercito[] novo = new Exercito[this.inimigos.length + 1];
		for(int i=0; i<this.inimigos.length; i++) 
			novo[i] = this.inimigos[i];
		
		novo[novo.length-1] = inimigo;
		this.inimigos = novo;
	}
	
	public void addLocalidade(Localidade local) {
		Localidade[] novo = new Localidade[this.localidades.length + 1];
		for(int i=0; i<this.localidades.length; i++)
			novo[i] = this.localidades[i];
		
		novo[novo.length - 1] = local;
		this.localidades = novo;
	}
	
	public double potenciaRelativaAliados(Localidade local) {
		double potencia=0.0;
		for(Exercito e : this.aliados)
			potencia += e.potenciaRelativa(local);
		return potencia;
	}
	
	public double potenciaRelativaInimigos(Localidade local) {
		double potencia = 0.0;
		for(Exercito e : this.inimigos)
			potencia += e.potenciaRelativa(local);
		return potencia;
	}
	
	public double calcularForcaConflito(String localidade) {
		Localidade l = findByName(localidade);
		return this.potenciaRelativaAliados(l);
	}
	
	private Localidade findByName(String localidade) {
		for(Localidade l : this.localidades)
			if(l.getNome().equals(localidade))
				return l;
		return null;
	}

}
