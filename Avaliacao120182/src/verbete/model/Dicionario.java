package verbete.model;

//letra H
public class Dicionario {
	private Verbete [] verbetes;
	
	public Dicionario(){
        this.verbetes = new Verbete[0];
    } 
	
	public Dicionario adicionarVerbete(Verbete verbete){
        Verbete[] aux = new Verbete[this.verbetes.length + 1];
        for(int iCont = 0; iCont < this.verbetes.length; iCont++)
          aux[iCont] = this.verbetes[iCont];
        aux[aux.length -1] = verbete;  
        this.verbetes = aux;
        return this;
    } 
	
	public Verbete getVerbete(String entrada) {
		for(Verbete v : this.verbetes)
			if(v.getEntrada(entrada))
				return v;
		return null;
	}
	
	//Letra I
	public boolean proximidadeSemantica(String[] frase1, String[] frase2) {
		//TODO
		Verbete[] vFrase1 = this.comparaFrase(frase1);
		Verbete[] vFrase2 = this.comparaFrase(frase2);
		
		return this.comparaEquivalencia(vFrase1, vFrase2) &&
				this.comparaEquivalencia(vFrase1,  vFrase2);
	}
	
	public Verbete[] comparaFrase(String[] entrada) {
		Verbete[] frase = new Verbete[entrada.length];
		for(int i=0; i<entrada.length; i++)
			frase[i] = this.percorrerArrayVerbetes(entrada[i]);
		
		return frase;
	}
	
	public Verbete percorrerArrayVerbetes(String frase) {
		for(Verbete v : this.verbetes)
			if(v.getEntrada(frase))
				return v;
		return null;
	}
	
	private boolean comparaEquivalencia(Verbete[] original, Verbete[] ref) {
		for(Verbete o : original)
			if(o != null && o.tipificaPalavra())
				if(!this.comparaEquivalencia(o, ref))
					return true;
		return false;
	}
	
	private boolean comparaEquivalencia(Verbete original, Verbete[] frases) {
		for(Verbete v : this.verbetes)
			if(v.calculaEquivalencia(original))
				return true;
		return false;
	}
}
