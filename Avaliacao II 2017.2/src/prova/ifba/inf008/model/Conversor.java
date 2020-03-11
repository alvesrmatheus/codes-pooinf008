package prova.ifba.inf008.model;

public class Conversor {
	public Mapa converter(Mapa mapa, ConverterColor conversor){
        Mapa novo = conversor.getMapa(mapa.getLargura(), mapa.getAltura());
        for(int i = 0; i < mapa.getLargura(); i++)
          for(int j = 0; j < mapa.getLargura(); j++){
              Pixel pixel = mapa.getPixel(i, j);
              Pixel novoPixel = conversor.converter(pixel);
              novo.setPixel(i, j, novoPixel);
          }    
        return novo;  
    }    
}
