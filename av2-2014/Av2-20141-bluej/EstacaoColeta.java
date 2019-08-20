public class EstacaoColeta extends UnidadeSensora{
     private double[] historicoValores = new double[0];
    
    public EstacaoColeta(String id){
        super(id);
    }
    
    public Mensagem processar(){
        int totalFilhos = 0;
        double sumMedida = 0; 
        double valorMedio = 0;
        
        for(UnidadeSensora unidadeSensora : filhos){
            Mensagem m = unidadeSensora.processar();
            System.out.println(m);
            totalFilhos += m.qtdEstacoes();
            sumMedida += m.tempTotal();
        }    
        
        valorMedio = sumMedida / totalFilhos;
        this.addValorMedio(valorMedio);
        
        
        return new Mensagem(this.id, valorMedio, totalFilhos);
    };  
    
    public void addValorMedio(double valorMedio){
       double[] novo = new double[this.historicoValores.length + 1];
       
       for(int i = 0; i < this.historicoValores.length; i++)
        novo[i] = this.historicoValores[i];
       novo[novo.length - 1] = valorMedio;
       this.historicoValores = novo;        
    }    
}
