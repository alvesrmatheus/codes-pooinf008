public class Visao{ 
    /*Classe equivalente ao view retornado pelo sgbd 
    ao executar o comando SELECT*/
   private String objeto_id;
   private String nome;
   private Coluna[] colunas;
   
   public boolean escrita(){
       return true;
   }
    
   public boolean leitura(){
       return true;
   }
    
   public boolean livre(){
       return true;
   }
}
