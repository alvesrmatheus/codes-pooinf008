package pooinf008;

public class EstacaoColeta extends UnidadeSensora{
	private double[] historicoValores;

	public double[] getHistoricoValores() {
		return historicoValores;
	}

	public void setHistoricoValores(double[] historicoValores) {
		this.historicoValores = historicoValores;
	}
	
	public double retornaMedia() {
		double media = 0.0;
		for(int i=0; i<getHistoricoValores().length; i++) 
			media += this.historicoValores[i];
		
		media /= getHistoricoValores().length;
		return media;
	}
}
