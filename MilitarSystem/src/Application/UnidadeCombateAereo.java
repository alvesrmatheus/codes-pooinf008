package Application;

public class UnidadeCombateAereo extends UnidadeCombate {
	private int qtdAvioesCacas;

	public UnidadeCombateAereo(String id, int qtdMilitares, Localidade l) {
		// TODO Auto-generated constructor stub
		super(id, qtdMilitares, l);
	}

	@Override
	public double potenciaAbsoluta() {
		// TODO Auto-generated method stub
		return qtdMilitares + (10 * qtdAvioesCacas);
	}

}
