package verbete.App;

import verbete.model.ClasseGramatical;
import verbete.model.Dicionario;
import verbete.model.Verbete;

public class App {
	
private Dicionario dicionario;
    
    public App(){
        this.dicionario = new Dicionario();
        this.criarVerbetes();
    }    
    
    
    private void criarVerbetes(){
        Verbete o = new Verbete("o", "o", ClasseGramatical.ARTIGO);
        Verbete verbete = new Verbete("verbete", "verbete", ClasseGramatical.SUBSTANTIVO);
        Verbete eh = new Verbete("�", "verbo ser", ClasseGramatical.VERBO);
        Verbete muito = new Verbete("muito", "muito", ClasseGramatical.ADVERBIO);
        Verbete interessante = new Verbete("interessante", "interessante", ClasseGramatical.ADJETIVO);
        Verbete apontamento = new Verbete("apontamento", "apontamento", ClasseGramatical.SUBSTANTIVO);
        Verbete grifado = new Verbete("grifado", "grifado", ClasseGramatical.ADJETIVO);
        Verbete destacado = new Verbete("destacado", "destacado", ClasseGramatical.ADJETIVO);

        verbete.addSinonimo(apontamento);
        destacado.addSinonimo(grifado);
        
        dicionario.adicionarVerbete(o)
                  .adicionarVerbete(verbete)
                  .adicionarVerbete(eh)
                  .adicionarVerbete(muito)
                  .adicionarVerbete(interessante)
                  .adicionarVerbete(apontamento)
                  .adicionarVerbete(grifado)
                  .adicionarVerbete(destacado);        
        
    }    
    
    
    public void exemploQuestao10(){
        String[] frase1 = {"o", "verbete", "�", "muito", "interessante"};
        String[] frase2 = {"o", "interessante", "apontamento"};  
        String[] frase3 = {"o", "interessante", "apontamento", "grifado"};  
        System.out.println("Proximidade sem�ntica entre:");
        System.out.println("\"O verbete � muito interessante\" e \"O interessante apontamento\".");
        System.out.println(this.dicionario.proximidadeSemantica(frase1, frase2));
        System.out.println("\"O verbete � muito interessante\" e \"O interessante apontamento grifado\".");
        System.out.println(this.dicionario.proximidadeSemantica(frase1, frase3));
        
    }    
    
    public void run(){
        Verbete v = new Verbete("verbete", 
        "conjunto das acep��es...", ClasseGramatical.SUBSTANTIVO);
        Verbete v2 = new Verbete("verbete2", 
        "conjunto das acep��es2...", ClasseGramatical.ADVERBIO);
        
        System.out.println(v);
        System.out.println("***");
        System.out.println(v2); 
        System.out.println("***");        
        System.out.println("***");        
        
        v.addSinonimo(v2);
        
        System.out.println(v);
        System.out.println("***");
        System.out.println(v2); 
        System.out.println("***");        
        System.out.println("***");        
        
        v2.addSinonimo(v);        
        System.out.println(v);
        System.out.println("***");
        System.out.println(v2); 
        System.out.println("***");        
        System.out.println("***");        
    }    
}
