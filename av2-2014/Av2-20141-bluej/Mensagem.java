public class Mensagem {
    
    private String srcId;
    private ValorSensoriado[] valores;
    
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
