public class Pessoa{
    private String nome;
    private String matricula;
    private Atividade[] minhaListaAtividades;
    
    public Pessoa(String nome, String matricula, 
                    Atividade[] minhaLista){
          this.nome = nome;
          this.matricula = matricula;
          this.minhaListaAtividades = new Atividade[0];
    }
}
