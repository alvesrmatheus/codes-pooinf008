package prova.model;
public class Cromossomo{
    private Gene[] genes;
    
    public Cromossomo() {}
    
    public Cromossomo(int tam){
        this.genes = new Gene[tam];
    }
    
    public Cromossomo(String valores) {
    	this.genes = new Gene[valores.length()];
    	for(int i=0; i<this.genes.length; i++)
    		if(valores.charAt(i) == '*')
    			this.genes[i] = null;
    		else
    			this.genes[i] = new Gene(valores.charAt(i) - '0');
     }
    
    
    public Gene getGene(int pos) {
		return this.genes[pos];
	}

	public void setGene(int pos, Gene gene) {
		this.genes[pos] = gene;
	}
	
	public void setGene(int pos, int valor) {
		this.setGene(pos, new Gene(valor));
	}

	public Gene buscarAlelo(int valor){
        for(int i=0; i<this.genes.length; i++)
            if(this.genes[i].getValor() == valor)
                return this.genes[i];      
        return null;
    }
    
    public Cromossomo clonar(){
    	Cromossomo cromo = new Cromossomo();
        for(int i=0; i<this.genes.length; i++)
        	if(this.getGene(i) != null)
        	//cromo.genes[i].setValor(this.genes[i].getValor());
        		this.genes[i].clonar();
        
        return cromo;
    }
    
    public double percentSim(Cromossomo cromo){
    	int similaridade=0;
    	for(int i=0; i<this.genes.length && i < cromo.genes.length; i++){
    		if((this.getGene(i)== null && cromo.getGene(i) != null) 
    			|| (this.getGene(i) != null && cromo.getGene(i) == null))
    			similaridade-=2;
    		else if((this.getGene(i) != null && cromo.getGene(i) == null)
    			|| (this.getGene(i) != null && cromo.getGene(i) == null))
    			similaridade+=2;
    		
    		if(this.getGene(i).equals(cromo.getGene(i)))
    			similaridade+=1;
    		else 
    			similaridade-=1;
    	}
    		
    	return (double)similaridade / this.genes.length;
    }
    
    
    public void cruzamento(Cromossomo cromo, int pontoUnico) {
    	Gene[] aux1 = new Gene[cromo.genes.length];
    	Gene[] aux2 = new Gene[this.genes.length];
    	
    	for(int i=0; i < pontoUnico; i++) {
    		aux1[i] = this.getGene(i);
    		aux2[i] = cromo.getGene(i);     		
    	}
    	
    	for(int i = pontoUnico; i < aux1.length; i++)
    		aux1[i] = cromo.getGene(i);
    	
    	for(int j = pontoUnico; j < aux2.length; j++)
    		aux2[j] = this.getGene(j);
    	
    	cromo.genes = aux1;
    	this.genes = aux2;
    }
}
