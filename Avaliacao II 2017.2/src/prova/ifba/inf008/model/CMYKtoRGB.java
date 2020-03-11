package prova.ifba.inf008.model;

public class CMYKtoRGB implements ConverterColor {

	@Override
	public Mapa getMapa(int altura, int largura) {
		return new MapaRGB();
	}

	@Override
	public Pixel converter(Pixel pixel) {
		PixelRGB novoPixel = new PixelRGB();
        PixelCMYK velhoPixel = (PixelCMYK) pixel;
        novoPixel.setRed(255 * (1 - velhoPixel.getCyan()) *  (1 - velhoPixel.getKey()));
        novoPixel.setGreen(255 * (1 - velhoPixel.getMagenta()) *  (1 - velhoPixel.getKey()));        
        novoPixel.setBlue((255 * (1 - velhoPixel.getYellow()) *  (1 - velhoPixel.getKey()))); 
        return novoPixel;
	}
	
	
}
