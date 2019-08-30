public class Mensagem {
    
    private String id;
    private ValorSensoriado[] valores;
    
    public Mensagem(String id){
        this.id = id;
    }
    
    public Mensagem(){
        
    }
    
    public double media(){
       int qtde = 0;
       double temp = 0;
       
       for(ValorSensoriado valor :  this.valores){
           qtde += valor.getQtdeEstacoes();
           temp += valor.getTempTotal();
        }    
        
       return temp / qtde; 
    } 
}
