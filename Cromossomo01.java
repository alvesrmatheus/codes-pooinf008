public class Cromossomo{
    private Gene[] gene;
    
    public Cromossomo(int quantity){
        // inicializa variáveis de instância
        this.gene = new Gene[quantity];
    }
    
    public Cromossomo(String valores){
        this.gene = new Gene[];
    }
    
    public Gene getGene(int allele){
        return this.gene[allele];
    }
    
    public void setGene(int allele, Gene gene){
        this.gene[allele] = gene;
    }
    
    public void setGene(int allele, int valor){
        this.setGene(allele, new Gene(valor));
    }
    
    public int getQuantity(){
        return this.gene.length;
    }
    
    public Cromossomo clone(){
        Cromossomo chromo = new Cromossomo(this.getQuantity());
        for(int i=0; i<this.gene.length; i++){
            chromo.setGene(i, this.getGene(i).clonador());
        }
        return chromo;
    }

    public double getPercentIdentity(Cromossomo Cromo){
        int pctSimilaridade=0;
        for(int i=0; i<this.getQuantity() && i < Cromo.getQuantity(); i++){
            if((this.getGene(i) == null && Cromo.getGene(i) != null) || (this.getGene(i) != null && Cromo.getGene(i) == null)){
                pctSimilaridade -= 2;
            } else if((this.getGene(i)==null && )){
                
            }
                
                    
        }
    }
}
