public class Verbete{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String substantivo;
    private String classeGramatical;
    private String descricao;
 
    /**
     * Construtor para objetos da classe Verbete
     */
    public Verbete(String subs, String gramClass, String descricao){
        this.substantivo = subs;
        this.classeGramatical = gramClass;
        this.descricao = descricao;
    };
    
    public String getSubs(){
        return this.substantivo;
    }
    
    public String getClassGram(){
        return this.classeGramatical;
    }
    
    public String getDescricao(){
        return this.descricao;
    }

}
