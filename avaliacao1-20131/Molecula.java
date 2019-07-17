public class Molecula{
    // instance variables - replace the example below with your own
    private ElementoQuimico[] atomos;

    public Molecula(){
        // initialise instance variables
        this.atomos = new ElementoQuimico[10];
    }
    
    public void setAtomos(ElementoQuimico atomos){
        this.atomos[0] = atomos;
    }
    
    public ElementoQuimico getAtomos(){
        return this.atomos[0];
    }
    
    public int getTamanho(){
        return atomos.length;
    }
}
