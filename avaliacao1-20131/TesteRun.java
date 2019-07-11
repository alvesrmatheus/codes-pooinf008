public class TesteRun{
    // instance variables
    ElementoQuimico atomo = new ElementoQuimico("Potássio", 19, 39.0);
    ElementoQuimico atomo1 = new ElementoQuimico("Lítio", 3, 7.00);
    //ElementoQuimico atomo2 = new ElementoQuimico("Mn(Mangânes)", 25, 55);
    int at0 = atomo.numeroEletrons(); 
    int at1 = atomo1.numeroEletrons();
    
    System.out.println("########################");
    System.out.println("Eletrons(atomo 0): ", at0);
    System.out.println("Eletrons(atomo1): ", at1);
}
