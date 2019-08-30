public abstract class UnidadeSensora {
    
    private String id;
    private double latitude;
    private double longitutude;
    private double altura;
    protected UnidadeSensora pai;
    protected UnidadeSensora[] filhos = new UnidadeSensora[0];

    public UnidadeSensora(String id){
        this.id = id;
        this.filhos = new UnidadeSensora[0];
    }    
    
    public void addFilho(UnidadeSensora novoFilho){
       UnidadeSensora[] novo = new UnidadeSensora[this.filhos.length + 1];
       
       for(int i = 0; i < this.filhos.length; i++)
            novo[i] = this.filhos[i];
            
       novo[novo.length - 1] = novoFilho;
       this.filhos = novo;
       novoFilho.pai = this;
    }
    
    public void setPai(UnidadeSensora us){
        this.pai = us;
    } 
    
    
    public Mensagem processar(){
        return null;
    }    
}
