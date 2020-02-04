public class App{
    private void run(){
        ContaCorrente cc1 = new ContaCorrente();
        ContaCorrente cc2 = new ContaCorrente();
        System.out.println("");
        cc1.depositar(5000);
        cc1.transferir(1000, cc2);
        ContaEspecial ce1 = new ContaEspecial();
        ce1.emprestimo(500);
        
    }
    
    public static void main(String[] args){
        App app = new App();
        app.run();
    }
}
