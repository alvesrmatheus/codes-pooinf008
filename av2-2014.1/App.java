public class App{
    
    public void run(){
      RegistroContabil rc = new RegistroContabil("ACME", 
                            "000.000.000/0000-00");
      //rc.registrarFato(2, "Compra Predio Sede", "Caixa", 3000);
      //rc.registrarFato(1, "Integração de Capitalização",
        //                "CAPITAL SOCIAL", 10000);
    }
    
    public static void main(String[] args){
        App app = new App();
        app.run();
    }
}
