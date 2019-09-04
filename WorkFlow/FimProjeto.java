public class FimProjeto extends AtividadeElementar{
    
    //private int duracaoDias=0;
    
    public FimProjeto(){
        //super(duracao, status);
    }
    
    public boolean isAtividadeInicio(){
        return false;
    }
    
    public boolean isAtividadeFim(){
        return true;
    }
    
    public int getDuracao(){
        return 0;
    }
}
