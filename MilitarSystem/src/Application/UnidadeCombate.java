package Application;

public abstract class UnidadeCombate implements ElementoCombateIF {
	private String id;
	protected int qtdMilitares;
	private Localidade localidade;
	
	public UnidadeCombate(String id, int qtdMilitares, Localidade l) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.qtdMilitares = qtdMilitares;
		this.localidade = l;
	}
	
	public abstract double potenciaAbsoluta();
	
	public double potenciaRelativa(Localidade l){
		return this.getLocalidade().getInfluencia(l) 
				* this.potenciaAbsoluta();
		
	}

	private Localidade getLocalidade() {
		// TODO Auto-generated method stub
		return this.localidade;
	}
}
