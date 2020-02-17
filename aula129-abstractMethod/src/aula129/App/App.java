package aula129.App;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import aula129.model.Circulo;
import aula129.model.Forma;
import aula129.model.Retangulo;
import aula129.model.enums.Cor;

public class App {
	
	public void run(){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Forma> list = new ArrayList<>(); 
		System.out.println("CRIADOR DE FIGURAS GEOMÉTRICAS\n\nQuantas formas deseja?");
		int n = sc.nextInt();
	
		for(int i=0; i<n; i++){
			System.out.println("Dados da figura #" + i);
			System.out.println("Retangulo ou Circulo(r/c)?");
			char ch = sc.next().charAt(0);
			System.out.printf("Entre com a cor: ");
			Cor cor = Cor.valueOf(sc.next());
			
			if (ch=='r') {
				System.out.printf("Entre com os valores de altura e largura: ");
				double alt = sc.nextDouble();
				double larg = sc.nextDouble();
				list.add(new Retangulo(cor, larg, alt));
			} else if(ch=='c'){
				System.out.printf("Entre com o valor do raio: ");
				double raio = sc.nextDouble();
				list.add(new Circulo(cor, raio));
			}
			
		}
		
		System.out.println();
		System.out.println("ÁREA DAS FIGURAS:");
		for(Forma f : list)
			System.out.println(f.toString());
	}
	
	public static void main(String[] args) {
		App app = new App();
		app.run();
	}
}
