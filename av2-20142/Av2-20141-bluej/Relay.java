public class Relay extends SensorNode{

    public Relay(String id){
        super(id);
    } 
    
    public  Mensagem concatenar(Mensagem minha, Mensagem filha){
        minha.addd(filha.getValores());
        minha.add(this.valor);
        return minha;
    }    
        
}
