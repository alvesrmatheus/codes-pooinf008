package aula129.App;

import aula129.model.Circulo;
import aula129.model.Forma;
import aula129.model.Retangulo;

public class App {
	
	public void run(){
		Forma f1 = new Retangulo(5, 5);
		Forma f2 = new Circulo(5);
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
	}
	
	public static void main(String[] args) {
		App app = new App();
		app.run();
	}
}
