package Application;

public class UnidadeCombateTerrestre extends UnidadeCombate {
	private int qtdTanques;
	private int qtdBlindados;
	
	public UnidadeCombateTerrestre(String id, int qtdMilitares, Localidade l) {
		// TODO Auto-generated constructor stub
		super(id, qtdMilitares, l);
	}


	@Override
	public double potenciaAbsoluta() {
		// TODO Auto-generated method stub
		return qtdMilitares+(3 * qtdBlindados)+(5 * qtdTanques);
		
	}
	
}
