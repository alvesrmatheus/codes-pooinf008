package aula129.model;

import aula129.model.enums.Cor;

public class Retangulo extends Forma{
	private double largura;
	private double altura;
	
	public Retangulo(Cor cor, double larg, double alt){
		super(cor);
		this.setAltura(alt);
		this.setLargura(larg);
	}
	
	private double getLargura() {
		return largura;
	}

	private void setLargura(double largura) {
		this.largura = largura;
	}

	private double getAltura() {
		return altura;
	}

	private void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return largura*altura;
	}

	@Override
	public String toString() {
		return 	String.format("Area do Retangulo: %.2f", 
				+ calcularArea());
	}
	
	
}
