public class ControladorAreaSensoreada {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AreaSensoreada area1 = new AreaSensoreada();
    }

    
    public void controlarAplicacao(){
        Relay r1 = new Relay();
        Relay r2 = new Relay();
        
        Relay r11 = new Relay();
        Relay r12 = new Relay();
        
        Relay r22 = new Relay();
        Relay r23 = new Relay();
        
        r1.addFilho(r11.addFilho(r12));
        r2.addFilho(r22.addFilho(r23));
    }
}
