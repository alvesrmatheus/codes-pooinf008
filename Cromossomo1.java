public class Cromossomo{
    private Gene[] genes;
    
    public Cromossomo(){
        this.genes = new Gene[0];
    }
    
    public Gene buscarAlelo(int valor){
        for(int i=0; i<this.genes.length; i++)
            if(this.genes[i].getValor() == valor)
                return this.genes[i];      
        return null;
    }
    
    public Cromossomo clonar(Cromossomo cromo){
        
        return null;
    }
}
