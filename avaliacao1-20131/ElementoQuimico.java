public class ElementoQuimico {
    // variáveis de instância
    //Atomos que contém ions tem o numero de protons diferente(!=) do numero de eletrons
    //Aqui consideramos apenas atomos na sua forma neutra
    private int numeroAtomico;
    private double massaAtomica;
    private String nomeElemento;
 
    public ElementoQuimico(String nomeElemento, int numeroAtomico, double massaAtomica){
       this.nomeElemento = nomeElemento;
       this.numeroAtomico = numeroAtomico;
       this.massaAtomica = massaAtomica;
    }
    
    public String getNomeElemento(){
        return this.nomeElemento;
    }
    
    public void setNomeElemento(String nomeElemento){
        this.nomeElemento = nomeElemento;
    }
    
    public int getNumeroAtomico(){
        return this.numeroAtomico;
    }
    
    public void setNumeroAtomico(int numeroAtomico){
        this.numeroAtomico = numeroAtomico;
    }
    
    public double getMassaAtomica(){
        return this.massaAtomica;
    }
    
    public void setMassaAtomica(double massaAtomica){
         this.massaAtomica = massaAtomica;
    }
    //*********************************************************
    
    public boolean compararElementos(ElementoQuimico atomo){
        return this.getNumeroAtomico() == atomo.getNumeroAtomico();
    }
    
    public int numeroEletrons(){//camadas 1 a 7 / Subniveis s p d f / orbital(max 2 eletrons)
        //N° atomico = n° de protons = n° de eletrons(atomos sem ions) 
        return getNumeroAtomico();
    }
}
