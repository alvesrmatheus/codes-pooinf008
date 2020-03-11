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
	
	public float getCyan() {
		return cyan;
	}

	public void setCyan(float cyan) {
		this.cyan = cyan;
	}

	public float getMagenta() {
		return magenta;
	}

	public void setMagenta(float magenta) {
		this.magenta = magenta;
	}

	public float getYellow() {
		return yellow;
	}

	public void setYellow(float yellow) {
		this.yellow = yellow;
	}

	public float getKey() {
		return key;
	}

	public void setKey(float key) {
		this.key = key;
	}

	@Override
	public double getLuminosidade() {
		return this.key;
	}

}
