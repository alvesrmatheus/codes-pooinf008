public class Teste{
    
    private Dicionario teste;
    
    public void run(){
        Verbete v = new Verbete("verbete", 
        "conjunto das acepções...", ClasseGramatical.SUBSTANTIVO);
        Verbete v2 = new Verbete("verbete2", 
        "conjunto das acepções2...", ClasseGramatical.ADVERBIO);
        
        System.out.println(v);
        System.out.println("***");
        System.out.println(v2); 
        System.out.println("***");        
        System.out.println("***");        
        
        v.adicionarSinonimoOutro(v2);
        
        System.out.println(v);
        System.out.println("***");
        System.out.println(v2); 
        System.out.println("***");        
        System.out.println("***");        
        
        v2.adicionarSinonimoOutro(v);        
        System.out.println(v);
        System.out.println("***");
        System.out.println(v2); 
        System.out.println("***");        
        System.out.println("***");        
    }    
}
