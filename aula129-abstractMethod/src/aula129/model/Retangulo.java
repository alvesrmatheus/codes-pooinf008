package aula129.model;

public class Retangulo extends Forma{
	private double largura;
	private double altura;
	
	public Retangulo(double larg, double alt){
		super();
		this.largura = larg;
		this.altura = alt;
	}
	
	@Override
	public double calcularArea() {
		return largura*altura;
	}

	@Override
	public String toString() {
		return 	"Area do Retangulo: " 
				+ calcularArea();
	}
	
	
}
