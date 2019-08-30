package Aplicacao;


public class DomainException extends RuntimeException {
	
	/*Exce��o personalizada
	 * Exception or RuntimeException: Caso o erro personalizado herde de Exception, o programador
	 * a tratar esse erro obrigatoriamente
	 * Caso herde de RuntimeException, o programador n�o � obrigado a tratar esse erro, possibilitando o programa
	 * de quebrar!
	 * */
	
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg){
		super(msg);
	}
}
