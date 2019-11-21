package prova.app;

import prova.model.Playlist;

public interface CriarDatabaseIF {
	
	public Playlist geradorPlaylist(Playlist origin, String nome, double duracao);
}
