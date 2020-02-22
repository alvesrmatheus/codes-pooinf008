package aula185.interfaces.service;

public class taxaImpostoBrasil implements ServicoDeImposto{
	
	public double imposto(double valor){
		if(valor <= 100.0)
			return valor * 0.2;
		
		return valor * 0.15;
	}
	
}
