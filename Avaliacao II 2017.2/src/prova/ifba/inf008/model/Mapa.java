package prova.ifba.inf008.model;

public abstract class Mapa {
	
	public abstract Pixel[][] getPixels();
	public abstract Pixel getPixel(int x, int y);
    
    public int getAltura(){
        return this.getPixels().length;
    }    

    public int getLargura(){
        return this.getPixels()[0].length;
    } 
    
    private double getSimilaridade(int x, int y, Fragmento fragmento){
      double similaridade = 0;  
      for(int xCont = x, xFrag = 0; xCont < x + fragmento.getAltura(); xCont++, xFrag++)
        for(int yCont = y,  yFrag = 0; yCont < y + fragmento.getLargura(); yCont++, yFrag++)
          similaridade += this.getPixel(xCont, yCont).getSimilaridade(fragmento.getPixel(xFrag, yFrag));
      similaridade/=(fragmento.getAltura() * fragmento.getLargura());    
      return similaridade; 
    };
    
    
    public double getSimilaridade(Fragmento fragmento){
        double similaridade = 0;
        for(int xCont = 0; xCont < this.getAltura() - fragmento.getAltura(); xCont++)
          for(int yCont = 0; yCont < this.getLargura() - fragmento.getLargura(); yCont++){
              double similaridadeAtual = this.getSimilaridade(xCont, yCont, fragmento);
              if(similaridadeAtual > similaridade)
                similaridade = similaridadeAtual;
          } 
        return similaridade; 
    }
    
	protected abstract void setPixel(int i, int j, Pixel novoPixel);
}
