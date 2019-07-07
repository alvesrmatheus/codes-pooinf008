public class Cromossomo{
    private Gene[] gene;
    
    public Cromossomo(int quantity){
        this.gene = new Gene[quantity];
    }
    
    public Cromossomo(String valores){
        this.gene = new Gene[valores.length()];
        for(int i=0; i<this.getQuantity(); i++){
            if(valores.charAt(i) == '*')
                this.gene[i] = null;
            else 
                this.gene[i] = new Gene(valores.charAt(i));
        }
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
        for(int i=0; i<this.getQuantity() && i < Cromo.getQuantity(); i++)
            if((this.getGene(i) == null &&
            Cromo.getGene(i) != null) || 
            (this.getGene(i) != null &&
            Cromo.getGene(i) == null))
                pctSimilaridade -= 2;
            else if((this.getGene(i) != null) &&
                (Cromo.getGene(i) != null)){
                if(this.getGene(i).equals(Cromo.getGene(i)))
                    pctSimilaridade += 1;
                else
                    pctSimilaridade -= 1;
            }
            
        return ((double) pctSimilaridade) / this.getQuantity();             
                    
    }
    
    public void crossover(int pto, Cromossomo idn){
       Gene[] me = new Gene[idn.getQuantity()];
       Gene[] other = new Gene[this.getQuantity()];
       
       for(int i=0; i < pto; i++){
           me[i] = this.getGene(i);
           other[i] = idn.getGene(i);
       }
       
       for(int i = pto; i < me.length; i++){
           me[i] = idn.getGene(i);
       }
       
       for(int i = pto; i < other.length; i++){
           other[i] = this.getGene(i);
       }
       
       this.gene = me;
       idn.gene = other;
    }
    
    public String toString(){
        String str = "";
        for(Gene g : this.gene)
            str += g.getValor();
        return str;
    }
}
