package prova.model;

public class Playlist {
	private String nome;
	private Musica[] musicas;
	
	public Playlist(String nome) {
		this.nome = nome;
		this.musicas = new Musica[0];
	}
	
	//GETTERS AND SETTERS
	public Musica[] getMusicas() {
		return this.musicas;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setMusicas(Musica[] musicas) {
		this.musicas = musicas;
	}
	
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addMusica(Musica musica) {
		Musica[] aux = new Musica[this.musicas.length + 1];
		for(int i=0; i<this.musicas.length; i++)
			aux[i] = this.musicas[i];
		
		aux[aux.length+1] = musica;
		this.musicas = aux;
	}
	
	public boolean verificaExistencia(Musica musica) {
		for(Musica m : this.musicas)
			if(m.equals(musica))
				return true;
		return false;
	}
}
