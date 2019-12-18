public class Texto{
   private Palavra[] palavras;
   
   public double nivelDeSimilaridade(Texto texto){
       double similaridade=0;
       for(Palavra p : this.palavras)
            similaridade += texto.nivelDeSimilaridade(p);
       return similaridade / this.palavras.length;
   }
   
   public double nivelDeSimilaridade(Palavra palavra){
       double similaridade=0;
       for(Palavra p : this.palavras){
            if(similaridade < p.nivelDeSimilaridade(p))
                similaridade = p.nivelDeSimilaridade(p);         
       }
       return similaridade;
   }
   
}
