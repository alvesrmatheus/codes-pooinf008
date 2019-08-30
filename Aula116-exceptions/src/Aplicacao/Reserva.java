package Aplicacao;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Reserva {
	private String nomeCompleto;
	private int numeroQuarto;
	private Date dataChegada;
	private Date dataSaida;
	
	private static DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
	
	public Reserva(String nomeCompleto, int numeroQuarto, 
			Date dataChegada,
			Date dataSaida) {
		if(!dataSaida.after(dataChegada)){
			throw new DomainException("Data de saída não ser anterior a data de chegada!");
		}
		this.nomeCompleto = nomeCompleto;
		this.numeroQuarto = numeroQuarto;
		this.dataChegada = dataChegada;
		this.dataSaida = dataSaida;
	}
	
	
	public Date getDataChegada() {
		return this.dataChegada;
	}

	private void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	private void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
//----------------------------------------



	public void atualizarReserva(Date dataChegada, Date dataSaida) throws DomainException{
		Date dataAtual = new Date();
		if(dataChegada.before(dataAtual) || dataSaida.before(dataAtual)){
			throw new DomainException("Para atualizar a data de reserva, as mesmas devem ser futuras.\n");
		}
		else if(!dataSaida.after(dataChegada)){
			throw new DomainException("A data de saída deve ser depois da data de chegada!\n");
		}
		
		this.setDataChegada(dataChegada);
		this.setDataSaida(dataSaida);
	}
	
	public long duration(){
		long df = dataChegada.getTime() - dataSaida.getTime();
		return - TimeUnit.DAYS.convert(df, TimeUnit.MILLISECONDS);
	}


	@Override
	public String toString() {
		return "Reserva:\nNome Completo: " + nomeCompleto + ", Quarto="
				+ numeroQuarto + ", Data de entrada=" + df.format(dataChegada)
				+ ", Data de Saída=" + df.format(dataSaida) + "\n" + duration() + " noites.\n";
	}
	
	
	
}
