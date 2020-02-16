package aula129.model;

import aula129.model.enums.Cor;

public class Circulo extends Forma{
	private double raio;
	//private static final double pi = 3.14;
	
	
	public Circulo(Cor cor, double raio) {
		super(cor);
		this.setRaio(raio);;
	}
	//Getters and Setters
	private double getRaio() {
		return raio;
	}

	private void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI*(Math.pow(raio, 2));
	}

	@Override
	public String toString() {
		return "Area do Circulo: " + calcularArea();
	}
	
	
}
