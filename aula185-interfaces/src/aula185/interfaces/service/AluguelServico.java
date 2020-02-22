package aula185.interfaces.service;

import aula185.interfaces.model.AluguelCarro;
import aula185.interfaces.model.Fatura;

public class AluguelServico{
	private double precoPorHora;
	private double precoPorDia;
	private ServicoDeImposto impostoService;
	
	public AluguelServico(){}
	
	public AluguelServico(double precoPorHora, double precoPorDia, ServicoDeImposto imposto) {
		this.setPrecoPorDia(precoPorDia);
		this.setPrecoPorHora(precoPorHora);
		this.setServicoImposto(imposto);
	}

	public void processarFatura(AluguelCarro aluguelCarro) {
		long t1 = aluguelCarro.getRetirada().getTime();
		long t2 = aluguelCarro.getEntrega().getTime();
		double horas = (double) (t2 - t1) / 1000 / 60 / 60;
		double pagBasico;
		if(horas <= 12.0)
			pagBasico = getPrecoPorHora() * Math.ceil(horas);
		else 
			pagBasico = getPrecoPorDia() * Math.ceil(horas / 24);
		
		double taxa = impostoService.imposto(pagBasico);
		
		aluguelCarro.setFatura(new Fatura(pagBasico, taxa));
	}

	public double getPrecoPorHora() {
		return precoPorHora;
	}

	private void setPrecoPorHora(double precoPorHora) {
		this.precoPorHora = precoPorHora;
	}

	public double getPrecoPorDia() {
		return precoPorDia;
	}

	private void setPrecoPorDia(double precoPorDia) {
		this.precoPorDia = precoPorDia;
	}
	
	private void setServicoImposto(ServicoDeImposto imposto){
		this.impostoService = imposto;
	}
	
	
}
