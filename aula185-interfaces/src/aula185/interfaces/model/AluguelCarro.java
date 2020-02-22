package aula185.interfaces.model;

import java.util.Date;

public class AluguelCarro {
	
	private Date retirada;
	private Date entrega;
	private Veiculo veiculo;
	private Fatura fatura;
	
	public AluguelCarro(){}
	
	public AluguelCarro(Date retirada, Date entrega, Veiculo veiculo, Fatura fatura){
		this.setRetirada(retirada);
		this.setEntrega(entrega);
		this.setVeiculo(veiculo);
		this.setFatura(fatura);
	}

	private void setRetirada(Date retirada) {
		this.retirada = retirada;
	}

	private void setEntrega(Date entrega) {
		this.entrega = entrega;
	}

	private void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	public Date getRetirada() {
		return retirada;
	}

	public Date getEntrega() {
		return entrega;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}
	
	
}
