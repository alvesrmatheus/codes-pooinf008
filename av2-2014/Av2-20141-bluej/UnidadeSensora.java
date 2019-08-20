public class UnidadeSensora {
    
    private String id;
    private double latitude;
    private double longitutude;
    private double altura;
    private UnidadeSensora pai;
    private UnidadeSensora[] filhos = new UnidadeSensora[0];

    public UnidadeSensora(String id){
        this.id = id;
    }    
    
    
    public void addFilho(UnidadeSensora novoFilho){
       UnidadeSensora[] novo = new UnidadeSensora[this.filhos.length + 1];
       
       for(int i = 0; i < this.filhos.length; i++)
        novo[i] = this.filhos[i];
       novo[novo.length - 1] = novoFilho;
       this.filhos = novo;
       novoFilho.pai = this;
    }    
    
    
    public Mensagem processar(){
        return null;
    }    
}
