package aula185.interfaces.model;

public class Fatura {
	
	private double pagamentoBasico;
	private double taxa;
	
	public Fatura(){}

	public Fatura(double pagBasico){
		this.pagamentoBasico = pagBasico;
	}
	public Fatura(double pagamentoBasico, double taxa) {
		this.setPagamentoBasico(pagamentoBasico);
		this.setTaxa(taxa);
	}
	
	public double getTotalPagamento(){
		return getPagamentoBasico() + getTaxa();
	}

	public double getPagamentoBasico() {
		return pagamentoBasico;
	}

	public double getTaxa() {
		return taxa;
	}
	
	private void setPagamentoBasico(double pagamentoBasico) {
		this.pagamentoBasico = pagamentoBasico;
	}


	private void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}
