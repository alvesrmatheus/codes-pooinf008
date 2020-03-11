package prova.ifba.inf008.model;

public class MapaCMYK extends Mapa{
	
	private PixelCMYK[][] pixels;
	
	@Override
	 public Pixel[][] getPixels(){
         return this.pixels;
     }
     
     @Override
     public Pixel getPixel(int x, int y){
         return this.pixels[x][y];
     }   
	
     public void setPixel(int x, int y, Pixel pixel){
         this.pixels[x][y] = (PixelCMYK)pixel;
     }

}
