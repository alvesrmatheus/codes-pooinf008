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
}
