public class Dicionario{
    // instance variables - replace the example below with your own
    private Verbete[] verbetes;

    public Dicionario(){
        // initialise instance variables
        this.verbetes = new Verbete[0];
    }
    
    public Verbete getVerbete(String palavra){
        for(Verbete v : this.verbetes){
            if(v.verificaPalavra(palavra))
                return v;
        }
        return null;
    }
    
    public void adicionarVerbete(Verbete verbete){
        Verbete[] aux = new Verbete[this.verbetes.length + 1];
        for(int i=0; i<this.verbetes.length; i++)
            aux[i] = this.verbetes[i];
            
        aux[aux.length -1] = verbete;
        this.verbetes = aux;
    }
    
    public Verbete[] toVerbete(String[] palavras){
        Verbete[] frase = new Verbete[palavras.length];
        for(int i=0; i < palavras.length; i++){
            frase[i] = this.getVerbete(palavras[i]);
        }
        return frase;
    }
    
    public boolean verificaProximidadeSemanantica(String[] frase1, String[] frase2){
        return this.verificaEquivalencia(frase1, frase2) 
                && this.verificaEquivalencia(frase1, frase2);
    }
    
    public boolean verificaEquivalencia(String[] origem, String[] ref){
        Verbete[] verbeteOrigem = this.toVerbete(origem);
        Verbete[] verbeteRef = this.toVerbete(ref);
        
        for(Verbete vOrigem : verbeteOrigem){   
            if(vOrigem.verificaNomeVerbete()){
                if(!this.verificaEquivalencia(vOrigem, verbeteRef)){
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean verificaEquivalencia(Verbete o, Verbete[] verbetes){
        for(Verbete v : verbetes)
          if(v.equivalente(o))
            return true;
        return false;    
    }    
}