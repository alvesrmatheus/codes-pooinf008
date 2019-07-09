public class Verbete{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static final int SUBSTANTIVO = 0;
    
    private String palavra;
    private String descricao;
    private ClasseGramatical classeGramatical;
    private Verbete[] listaSinonimos;

    public Verbete(String palavra, String descricao, ClasseGramatical gramClass){
       this.palavra = palavra;
       this.descricao = descricao;
       this.classeGramatical = gramClass;
    }

    public String getPalavra(){
        // ponha seu código aqui
        return this.palavra;
    }
    
    private void setPalavra(String palavra){
        this.palavra = palavra;
    }
       
    public String getDescricao(){
        // ponha seu código aqui
        return this.descricao;
    }
    
    private void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public ClasseGramatical getClasseGramatical(){
        // ponha seu código aqui
        return this.classeGramatical;
    }
    
    private void setClasseGramatical(ClasseGramatical gramClass){
        this.classeGramatical = gramClass;
    }
    
    
    public void adicionarSinonimo(Verbete verbete){
        Verbete[] aux = new Verbete[this.listaSinonimos.length+1];
        
        for(int i=0; i<this.listaSinonimos.length; i++){
            aux[i] = this.listaSinonimos[i];
        }
        aux[aux.length-1] = verbete;
        this.listaSinonimos = aux;
    }
    
    public boolean comparaStringVerbete(String palavra){
        return this.getPalavra().equalsIgnoreCase(palavra);
    }
    
    public boolean equalsVerbetes(Verbete verbete){
       return this.getPalavra().equals(verbete.getPalavra()) 
       && this.getclasseGramatical().equals(verbete.getClasseGramatical()); 
    }
    
    public boolean equivalente(Verbete verbete){
        if(this.equals(verbete)) return true;
        
        for(Verbete v : this.listaSinonimos)
            if(v.equals(verbete))
                return true;
                
        return false;
    }
}
