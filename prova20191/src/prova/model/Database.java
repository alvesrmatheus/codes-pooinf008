package prova.model;

import prova.app.CriarDatabaseIF;

public class Database implements CriarDatabaseIF{
	private Musica[] musicas;
	
	public Database() {
		this.musicas = new Musica[0];
	}
	
	public Playlist geradorPlaylist(Playlist origin, String nome, double duracao) {
		Playlist novo = new Playlist(nome);
		double novaDuracao = 0.0;
		int cont = 0;
		
		for(int i=0; i<this.musicas.length - 1; i++) {
			for(int j=i+1; i<this.musicas.length; j++) {
				if(this.musicas[i].proximidadeMusical(origin) < this.musicas[j].proximidadeMusical(origin)) {
					Musica aux = this.musicas[i];
					this.musicas[i] = this.musicas[j];
					this.musicas[j] = aux;
				}
			}
		}
		
		while(novaDuracao <= duracao) {
			if(!origin.verificaExistencia(this.musicas[cont])) {
				novaDuracao += this.musicas[cont].getDuracao();
				novo.addMusica(this.musicas[cont]);
			}
			cont++;
		}
		return novo;
	}
}
