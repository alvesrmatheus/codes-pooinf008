package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import Aplicacao.DomainException;
import Aplicacao.Reserva;

public class Teste {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
		try{
			//Leitura dos dados -------------------------
			System.out.print("Nome Completo: ");
			String nome = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			System.out.print("Data de Chegada(dd/MM/yyyy): ");
			Date dataChegada = df.parse(sc.next());
			System.out.print("Data de Saída(dd/MM/yyyy): ");
			Date dataSaida = df.parse(sc.next());
			Reserva r1 = new Reserva(nome, quarto, dataChegada, dataSaida);
			//-------------------------------------------
			System.out.println("Reserva feita: " + r1);//Printa na tela
			System.out.println();
			//Atualiza as datas ------------------------------------
			System.out.println("Entre com as datas de atualização da reserva:\n");
			System.out.print("Data de chegada(dd/MM/yyyy): ");
			dataChegada = df.parse(sc.next());
			System.out.print("Data de Saída(dd/MM/yyyy): ");
			dataSaida = df.parse(sc.next());
			r1.atualizarReserva(dataChegada, dataSaida);
		} 
		catch(ParseException e){
			System.out.println("Formato de data incorreto!");
		}
		catch(DomainException d){
			System.out.println("Erro na reserva: " + d.getMessage());
		}
		catch(RuntimeException r){
			System.out.println("Erro Inesperado!");
		}
		finally{
			sc.close();
		}
		
	}

}
