package Exercico;

public class CamaroteSuperior extends VIP {
   public double valor;
   public double valorAdicional;
   
   
      @Override
    public void MostrarValor() {
        valorVIP = valor + valorAdicional;
        System.out.println(valorVIP);
    }
   
   
    
    
    
}
