public class ElementoQuimico{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
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
    
    public boolean compararElementos(ElementoQuimico eq){
        return this.getNumeroAtomico() == eq.getNumeroAtomico();
    }
    
    public int verificaEletrons(int camada){//camadas 1 a 7 / Subniveis s p d f / orbital(max 2 eletrons)
        return 0;
    }
}
