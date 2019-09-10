package Application;

public class UnidadeCombateTerrestre extends UnidadeCombate {
	private int qtdTanques;
	private int qtdBlindados;
	
	public UnidadeCombateTerrestre(String id, int qtdMilitares, 
			int qtdTanques, int qtdBlindados, Localidade l) {
		// TODO Auto-generated constructor stub
		super(id, qtdMilitares, l);
		this.qtdBlindados = qtdBlindados;
		this.qtdTanques = qtdTanques;
	}


	@Override
	public double potenciaAbsoluta() {
		// TODO Auto-generated method stub
		return qtdMilitares+(3 * qtdBlindados)+(5 * qtdTanques);
		
	}
	
}
