public class Palavra{
    private String armazenaPalavra;
    private Palavra[] similares;
    
    public Palavra(String p){
        this.armazenaPalavra = p;
        this.similares = new Palavra[0];
    }
    
    public Palavra(String palavra, Palavra sinonimo){
        this.armazenaPalavra = palavra;
        this.addPalavra(sinonimo);
    }
    
    private void addPalavra(Palavra palavra){
        Palavra[] aux = new Palavra[this.similares.length + 1];
        for(int i=0; i < this.similares.length; i++)
            aux[i] = this.similares[i];    
        aux[aux.length - 1] = palavra;
        this.similares = aux;
    }
    
    public String getPalavra(){
        return this.armazenaPalavra;
    }
    
    public boolean equals(Palavra palavra){
        return this.getPalavra().equals(palavra.getPalavra());
    }
    
    public boolean verificaSinonimo(Palavra palavra){
        return hasSinonimo(palavra);
    }
    
    private boolean hasSinonimo(Palavra palavra){
        for(Palavra s : this.similares)
            if(s.equals(palavra))
                return true;
        return false;
    }
    
    public double nivelDeSimilaridade(Palavra palavra){
        double nivelSimilaridade = 0.0;
        if(equals(palavra))
            nivelSimilaridade = 1;
            
        if(this.hasSinonimo(palavra) || palavra.hasSinonimo(this))
            qtdSinonimos(palavra);
        return 0.0;
    }
    
    private int qtdSinonimos(Palavra palavra){
        //TODO
        return 0;
    }
}
