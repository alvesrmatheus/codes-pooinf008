package prova.model;

public class Musica {
    private String titulo;
    private String[] artistas;
    private double duracao;
    private String genero;
    private CampoHarmonico ch;
    private String gravadora;
    
    public Musica() {}
    
    public Musica(String titulo, String[] artistas, double duracao, String genero,
            CampoHarmonico ch, String nomeGravadora){
        this.titulo = titulo;
        this.artistas = new String[0];
        this.duracao = duracao;
        this.genero = genero;
        this.ch = ch;
        this.gravadora = nomeGravadora;
    }
    
    private int tam(){
    	return this.artistas.length;
    }
    
    //GETTTERS AND SETTERS
    public String[] getArtistas() {
		return artistas;
	}

	public double getDuracao() {
		return duracao;
	}

	public String getGenero() {
		return genero;
	}

	public CampoHarmonico getCh() {
		return ch;
	}

	public String getGravadora() {
		return gravadora;
	}
	
	private String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	private void setArtistas(String[] artistas) {
		this.artistas = artistas;
	}

	private void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	private void setGenero(String genero) {
		this.genero = genero;
	}

	private void setCh(CampoHarmonico ch) {
		this.ch = ch;
	}

	private void setNomeGravadora(String nomeGravadora) {
		this.gravadora = nomeGravadora;
	}
//-------------------------------------------------------
	
	public boolean equals(Musica musica){
		if(this.getTitulo().equals(musica.getTitulo()))
			for(String s : this.getArtistas())
				if(this.getArtistas().equals(musica.artistas))
					return true;
        
        return false;
    }
    
    public double proximidadeMusical(Musica musica){
        int proxim=0; 
        
        if(this.ch.equals(musica.ch))
            proxim+=1;
            
        if(this.gravadora.equals(musica.gravadora))
            proxim+=1;
        
        if(this.genero.equals(musica.genero))
            proxim+=1;
        
        proxim+=(this.pctArtistas(musica) + 
                musica.pctArtistas(this)) /
                (this.artistas.length + musica.artistas.length);
            
        return(double)proxim;
    }
    
    public double proximidadeMusical(Playlist p) {
    	double proxim=0;;
    	for(Musica m : p.getMusicas())
    		if(this.proximidadeMusical(m) > proxim)
    			proxim = this.proximidadeMusical(m);
    	return proxim;
    }
    
    
    private double pctArtistas(Musica musica) {
    	int percentual=0;
    	
    	for(int i=0; i<tam(); i++) {
    		for(int j=0; j<musica.getArtistas().length; j++)
    			if(this.artistas[i].equals(musica.artistas[j]))
    				percentual++;
    	}
    	return percentual;	
    }
    

}
