package prova.ifba.inf008.model;

public class MapaRGB extends Mapa{
	private PixelRGB[][] pixels;
	
	@Override
	public Pixel[][] getPixels(){
        return this.pixels;
    }
    
   @Override
    public Pixel getPixel(int x, int y){
        return this.pixels[x][y];
    }   
    
    public void setPixel(int x, int y, Pixel pixel){
        this.pixels[x][y] = (PixelRGB)pixel;
    }

}
