package Exercico;

public class VIP extends Ingresso {

    private double valor;
    private double valorAdicional;
    public  double valorVIP;

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public void MostrarValor() {
        valorVIP = valor + valorAdicional;
        System.out.println(valorVIP);
    }

    

  
    
}
