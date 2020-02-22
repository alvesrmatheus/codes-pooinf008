package aula185.interfaces.App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import aula185.interfaces.model.AluguelCarro;
import aula185.interfaces.model.Veiculo;
import aula185.interfaces.service.AluguelServico;
import aula185.interfaces.service.taxaImpostoBrasil;

public class App {
	public void run() throws ParseException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Entre com os dados do aluguel:");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("\nRetirada do veículo(dd/MM/yyyy HH:ss): ");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("\nEntrega do veículo(dd/MM/yyyy HH:ss): ");
		Date finish = sdf.parse(sc.nextLine());
		
		AluguelCarro car1 = new AluguelCarro(start, finish, new Veiculo(carModel), null);

		System.out.print("Preço por hora: ");
		double precoPorHora = sc.nextDouble();
		System.out.print("Preço por dia: ");
		double precoPorDia = sc.nextDouble();
		
		AluguelServico aluguelServico = new AluguelServico(precoPorHora, precoPorDia, new taxaImpostoBrasil());
		
		aluguelServico.processarFatura(car1);

		System.out.println("Fatura:");
		System.out.println("Pagamento Inicial: " + String.format("%.2f", car1.getFatura().getPagamentoBasico()));
		System.out.println("Taxa: " + String.format("%.2f", car1.getFatura().getTaxa()));
		System.out.println("Pagamento Total: " + String.format("%.2f", car1.getFatura().getTotalPagamento()));
		
		sc.close();
	}
	
	public static void main(String[] args) {
		App app = new App();
		try {
			app.run();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
