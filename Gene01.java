public class Gene {
    private int valor;
    
    public Gene(int valor) {
        // TODO Auto-generated constructor stub
        this.setValor(valor);
    }
    
    public Gene() {
        // TODO Auto-generated constructor stub
    	//this.setValor(1);
        this(1);
    }
    
    public Gene(Gene gene) {
        // TODO Auto-generated constructor stub
        this(gene.getValor());
    }


    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if(valor > 0)
            this.valor = valor;
        else
            this.valor = 1;
    }
    
    public boolean isEquals(Gene gene) {
        return this.getValor() == gene.getValor(); 
    }
    
    public Gene clonador() {
        Gene geneclone = new Gene();
        geneclone.valor = this.valor;
        return geneclone;
    }
    
    public String toString(){
        return " [ "+ getValor() +" ] ";
    }
    
    public int getAfinidade(int valorProteina){
        return Math.abs(this.getValor() - valorProteina);
    }
    
    public int getAfinidade(Gene gene){
        return this.getAfinidade(gene.getValor());
    }
}
