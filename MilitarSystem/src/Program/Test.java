package Program;

import Application.Exercito;
import Application.Localidade;
import Application.RegiaoInfluencia;
import Application.SistemaEstrategiaMilitar;
import Application.UnidadeCombate;
import Application.UnidadeCombateAereo;
import Application.UnidadeCombateTerrestre;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Test()).run();
	}
	
    public void run(){
        
        SistemaEstrategiaMilitar sem = new SistemaEstrategiaMilitar();
        
        Localidade brasil = new Localidade("Brasil");
        Localidade argentina = new Localidade("Argentina"); 
        Localidade chile = new Localidade("Chile");
        Localidade paraguai = new Localidade("Paraguai");
        Localidade uruguai = new Localidade("Uruguai");
        
        Exercito a = new Exercito();
        Exercito b = new Exercito();
        Exercito c = new Exercito();
        Exercito d = new Exercito();        
        
        uruguai.addRegiaoInfluencia(new RegiaoInfluencia(brasil, 0.8));
        uruguai.addRegiaoInfluencia(new RegiaoInfluencia(uruguai, 1.0));        
        uruguai.addRegiaoInfluencia(new RegiaoInfluencia(argentina, 0.75));
        uruguai.addRegiaoInfluencia(new RegiaoInfluencia(paraguai, 0.6));        
        uruguai.addRegiaoInfluencia(new RegiaoInfluencia(chile, 0.5));        
        
        
        argentina.addRegiaoInfluencia(new RegiaoInfluencia(brasil, 0.9));
        argentina.addRegiaoInfluencia(new RegiaoInfluencia(uruguai, 0.9));        
        argentina.addRegiaoInfluencia(new RegiaoInfluencia(argentina, 1));
        argentina.addRegiaoInfluencia(new RegiaoInfluencia(paraguai, 0.5));        
        argentina.addRegiaoInfluencia(new RegiaoInfluencia(chile, 0.3));        
        

        chile.addRegiaoInfluencia(new RegiaoInfluencia(brasil, 0.2));
        chile.addRegiaoInfluencia(new RegiaoInfluencia(uruguai, 0.1));        
        chile.addRegiaoInfluencia(new RegiaoInfluencia(argentina, 0.7));
        chile.addRegiaoInfluencia(new RegiaoInfluencia(paraguai, 1));        
        chile.addRegiaoInfluencia(new RegiaoInfluencia(chile, 1));        
        
        paraguai.addRegiaoInfluencia(new RegiaoInfluencia(brasil, 0.4));
        paraguai.addRegiaoInfluencia(new RegiaoInfluencia(uruguai, 0.2));        
        paraguai.addRegiaoInfluencia(new RegiaoInfluencia(argentina, 0.5));
        paraguai.addRegiaoInfluencia(new RegiaoInfluencia(paraguai, 1));        
        paraguai.addRegiaoInfluencia(new RegiaoInfluencia(chile, 0.6)); 
        
        brasil.addRegiaoInfluencia(new RegiaoInfluencia(brasil, 1));
        brasil.addRegiaoInfluencia(new RegiaoInfluencia(uruguai, 0.7));        
        brasil.addRegiaoInfluencia(new RegiaoInfluencia(argentina, 0.8));
        brasil.addRegiaoInfluencia(new RegiaoInfluencia(paraguai, 0.7));        
        brasil.addRegiaoInfluencia(new RegiaoInfluencia(chile, 0.2));        
        
        a.add(new UnidadeCombateAereo("aUCA1", 100, 3, brasil));
        a.add(new UnidadeCombateTerrestre("aUCT1", 100, 5, 2, brasil));        
        //a.add(new UCNaval("aUCN1", 50, 3, 6, brasil));
        //a.add(new UnidadeDrones(brasil));

        b.add(new UnidadeCombateAereo("bUCT1", 100, 6, chile));
        b.add(new UnidadeCombateTerrestre("bUCT2", 100, 7, 8, chile));        

        c.add(new UnidadeCombateAereo("cUCA1", 50, 2, argentina));
        c.add(new UnidadeCombateAereo("cUCA2", 50, 2, argentina));        
        
        d.add(new UnidadeCombateAereo("dUCA1", 100, 2, uruguai));
        d.add(new UnidadeCombateTerrestre("dUCT1", 150, 2, 10, uruguai));      
        //d.add(new UCNaval("dUCN1", 100, 2, 8, uruguai));                

        
        sem.addLocalidade(brasil);
        sem.addLocalidade(argentina);
        sem.addLocalidade(chile);
        sem.addLocalidade(uruguai);
        sem.addLocalidade(paraguai);
        
        sem.addAliados(a);
        sem.addAliados(b);        
        sem.addInimigos(c);
        sem.addInimigos(d);
        
        System.out.println("Valor (Paraguai) : " + sem.calcularForcaConflito("Paraguai"));
        System.out.println("Valor (Argentina ): " + sem.calcularForcaConflito("Argentina"));        
        System.out.println("Valor (Uruguai ): " + sem.calcularForcaConflito("Uruguai"));                
        
        
    }
    

}
