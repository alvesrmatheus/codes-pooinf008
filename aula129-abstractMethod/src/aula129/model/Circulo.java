package aula129.model;

public class Circulo extends Forma{
	private double raio;
	private static final double pi = 3.1415;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		return this.pi*(Math.pow(raio, 2));
	}

	@Override
	public String toString() {
		return "Area do Circulo: " + calcularArea();
	}
	
	
}
