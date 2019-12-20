package ifba.ads.inf008.model;

public class Trajeto {
	private String descricao;
	private Via[] vias = new Via[0];
	
	public boolean isValid(Trajeto trajeto){
		for(Via v : this.vias)
			if(v != null && v.isAdjacente(v))
				return true;
		return false;
	}
	
	public double estimarTempo(int hora){
		double tempoTotal=0;
		for(Via v : this.vias)
			tempoTotal += v.getTempoMedio(hora);
		return tempoTotal;
	}
	
	public double estimarTempo() {
		double menorTempo = Double.MAX_VALUE;
		for(Via via : this.vias) {
			double[] velocidades = via.getVelocidades();
			for(int i = 0; i < velocidades.length; i++) {
				double tempo = estimarTempo((int)velocidades[i]);
				if(menorTempo < tempo) {
					menorTempo = tempo;
				}
			}
		}
		return menorTempo;
	}
	
	public int menorTrajeto(Trajeto trajeto, int hora){
		int menor=0;
		if(this.estimarTempo(hora) < trajeto.estimarTempo(hora))
			menor = -1;
		else if(this.estimarTempo(hora) > trajeto.estimarTempo(hora))
			menor = 1;
		else 
			menor = 0;
		
		return menor;
	}
}
