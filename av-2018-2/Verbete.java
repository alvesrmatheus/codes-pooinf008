public class Verbete{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String palavra;
    //private int tamanhoListaSinonimos;
    private String classeGramatical;
    private String descricao;
    private String[] listaSinonimos;

    public Verbete(String palavra, String gramClass, String descricao){
       this.palavra = palavra;
       this.classeGramatical = gramClass;
       this.descricao = descricao;
    }
    
    public Verbete(String palavra, String gramClass, String descricao, int tamanho){
       this.palavra = palavra;
       this.classeGramatical = gramClass;
       this.descricao = descricao;
       //new String[tamanho];
    }

    public String getPalavra(){
        // ponha seu código aqui
        return this.palavra;
    }
       
    public String getclasseGramatical(){
        // ponha seu código aqui
        return this.classeGramatical;
    }
       
    public String getDescricao(){
        // ponha seu código aqui
        return this.descricao;
    }
    
    public int comparaString(String s1){
        int comparaString;
        if(s1.equals(getPalavra()))
            comparaString = 1;
        else
            comparaString = 0;
            
        return comparaString;
    }
    
    public int equalsVerbetes(Verbete v1){
        int verificaVerbetes;
        if(getPalavra().equals(v1.getPalavra()) 
        && (v1.getclasseGramatical().equals(this.getclasseGramatical())))
            verificaVerbetes = 1;
         else 
            verificaVerbetes = 0;
        
        return verificaVerbetes;
    }
    
    public void adicionaSinonimo(String sinonimo){
        for(int i=0; i<listaSinonimos.length; i++){
            if(sinonimo.equals(listaSinonimos))
                return;
            else{
                listaSinonimos[i+1] = sinonimo;
            }
        }
    }
    
}
