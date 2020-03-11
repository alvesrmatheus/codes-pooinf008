package prova.ifba.inf008.model;

public class SistemaMilitar {
	private Mapa[] atlas;
	
	 public Mapa getMapaMaisSimilar(Fragmento fragmento){
	        Mapa mapa = null;
	        double simMapa = 0;
	        for(Mapa atual : this.atlas){
	            double simAtual = atual.getSimilaridade(fragmento);
	            if(simMapa < simAtual){
	                mapa = atual;
	                simMapa = simAtual;
	            }    
	        } 
	        return mapa;
	    }    
	
}
