public class AtividadeMacro extends Atividade{
    private String id;
    private String descricao;
    private Atividade[] souPreRequisitos;
    private Atividade[] meusPreRequisitos;
    
    public boolean isAtividadeInicio(){
        return false;
    }
    
    public boolean isAtividadeFim(){
        return true;
    }
}
