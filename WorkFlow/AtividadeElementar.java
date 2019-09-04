public class AtividadeElementar extends Atividade{
    private String id;
    protected int duracaoEmDias = 0;
    protected boolean status;
    protected String descricao;
    private Atividade[] preRequisitos;
    
    public AtividadeElementar(){
    }
    
    public AtividadeElementar(String id, int duracao, boolean status,
                            String descricao, Atividade[] preRequisitos){
           this.id = id;
           this.duracaoEmDias = duracao;
           this.status = status;
           this.descricao = descricao;
           this.preRequisitos = new Atividade[0];
                                    
    }
    
    public boolean isAtividadeInicio(){
        return false;
    }
    
    public boolean isAtividadeFim(){
        return false;
    }
}
