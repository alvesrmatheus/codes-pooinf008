public class Palavra{
    private String conteudo;
    private Palavra[] similares;
    
    public Palavra(String p){
        this.conteudo = p;
        this.similares = new Palavra[0];
    }
    
    public Palavra(String palavra, Palavra sinonimo){
        this.setConteudo(palavra);
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
        return this.conteudo;
    }
    
    private void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }
    
    public boolean equals(Palavra palavra){
        return this.getPalavra().equals(palavra.getPalavra());
    }
    
    private boolean hasSinonimo(Palavra palavra){
        for(Palavra s : this.similares)
            if(s.equals(palavra))
                return true;
        return false;
    }
    
    private double qtdSinonimo(Palavra palavra){
        double qtd=0;
        for(int i=0; i<this.similares.length; i++)
            for(int j=0; i<palavra.similares.length; j++)
                if(this.similares[i].equals(palavra.similares[j]))
                    qtd++;
                  
        return qtd;
    }
    
    public double nivelDeSimilaridade(Palavra palavra){
        double nivelSimilaridade = 0.0;
        if(this.equals(palavra))
            nivelSimilaridade = 1;
        if(this.hasSinonimo(palavra))
            nivelSimilaridade+= 0.5;
        return nivelSimilaridade + 
                (this.qtdSinonimo(palavra) /
                2*palavra.qtdSinonimo(this));
    }
}