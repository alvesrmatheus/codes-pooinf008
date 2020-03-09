package prova.ifba.inf008.model;

public class PixelCMYK extends Pixel{
	private float cyan;
	private float magenta;
	private float yellow;
	private float key;
	
	
	public PixelCMYK(float cyan, float magenta, float yellow, float key) {
		this.cyan = cyan;
		this.magenta = magenta;
		this.yellow = yellow;
		this.key = key;
	}


	@Override
	public double getLuminosidade() {
		return this.key;
	}

}
