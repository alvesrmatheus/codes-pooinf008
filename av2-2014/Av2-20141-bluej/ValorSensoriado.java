public class ValorSensoriado{
    
    private double tempMedia;
    private int qtdeEstacoes;
    
    
    public ValorSensoriado(double tempMedia, int qtdeEstacoes){
        this.setTempMedia(tempMedia);
        this.setQtdeEstacoes(qtdeEstacoes);
    };
    
    private void setTempMedia(double tempMedia){
        this.tempMedia = tempMedia;        
    }   
    
    private void setQtdeEstacoes(int qtdeEstacoes){
        this.qtdeEstacoes = qtdeEstacoes;        
    }       
    
    public int getQtdeEstacoes(){
        return this.qtdeEstacoes;
    }; 
    
    public double getTempMedia(){
        return this.tempMedia;
    };    
    
    public double getTempTotal(){
        return this.getTempMedia() * getQtdeEstacoes();
    }  
    
    public String toString(){
        return "<" + this.getTempMedia() + ", " + this.getQtdeEstacoes() + ">"; 
    }    
}