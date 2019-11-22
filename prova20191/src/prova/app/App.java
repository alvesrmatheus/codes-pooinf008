package prova.app;

import prova.model.Database;

public class App {
	
	private CriarDatabaseIF cd1;
	
	public void run() {
		this.cd1 = new Database();
	}
	
	
	
	public static void main(String[] args) {
		(new App()).run();
	}

}
