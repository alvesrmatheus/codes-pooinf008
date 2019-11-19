public class Musica{
    private String titulo;
    private String[] artistas;
    private double duracao;
    private String genero;
    private CampoHarmonico ch;
    private String nomeGravadora;
    
    public Musica(String titulo, String[] artistas, double duracao, String genero,
            CampoHarmonico ch, String nomeGravadora){
        this.titulo = titulo;
        this.artistas = new String[0];
        this.duracao = duracao;
        this.genero = genero;
        this.ch = ch;
        this.nomeGravadora = nomeGravadora;
    }
    
    public int tam(){
        return this.artistas.length;
    }
    
    public boolean equals(Musica musica){
        for(int i=0; i<tam(); i++){
            if(this.artistas.equals(musica.artistas))
                return true;
        }
        return false;
    }
    
    public double musicaProximidade(Musica musica){
        int proxim=0;
        double pctArtistas = 0.0;
        for(int i=0; i<tam(); i++){
            if(equals(musica))
                pctArtistas+=0.1;
        }
        
        if(this.ch.equals(musica.ch))
            proxim+=1;
            
        if(this.nomeGravadora.equals(musica.nomeGravadora))
            proxim+=1;
        
        if(this.genero.equals(musica.genero))
            proxim+=1;
            
        return (double)proxim + pctArtistas;
    }
}
