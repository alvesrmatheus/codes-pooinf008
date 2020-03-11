package prova.ifba.inf008.model;

public interface ConverterColor {
	
	public Mapa getMapa(int altura, int largura);
	
	public Pixel converter(Pixel pixel);
}
