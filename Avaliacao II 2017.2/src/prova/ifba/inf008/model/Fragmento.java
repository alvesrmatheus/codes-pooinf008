package prova.ifba.inf008.model;

public class Fragmento {
	private Pixel[][] pixels;
	
	public Pixel getPixel(int x, int y){
        return this.pixels[x][y];
    }; 
    
    
   public int getAltura(){
       return this.pixels.length;
   }    

   public int getLargura(){
       return this.pixels[0].length;
   }    
}
