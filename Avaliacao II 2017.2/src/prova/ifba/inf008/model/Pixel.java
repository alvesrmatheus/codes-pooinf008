package prova.ifba.inf008.model;

public abstract class Pixel {
	
	public abstract double getLuminosidade();
	
	public int getSimilaridade(Pixel outro){
        return (int) Math.abs(this.getLuminosidade() - outro.getLuminosidade());
    }  
}
