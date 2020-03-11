package prova.ifba.inf008.model;

public class PixelRGB extends Pixel{
	private float red;
	private float green;
	private float blue;
	
	public PixelRGB() {}
	
	public PixelRGB(float red, float green, float blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public float getRed() {
		return red;
	}

	public float getGreen() {
		return green;
	}

	public float getBlue() {
		return blue;
	}
	
	public void setRed(float red) {
		this.red = red;
	}

	public void setGreen(float green) {
		this.green = green;
	}

	public void setBlue(float blue) {
		this.blue = blue;
	}

	@Override
	public double getLuminosidade() {
		return (getRed()*0.3) + 
			(getGreen()*0.59) +
			(getBlue()*0.11) / 255;
	}


}
