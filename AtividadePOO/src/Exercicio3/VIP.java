package Exercicio3;
public class VIP extends Ingresso{
    
    private double valorAdicionalVIP = 10.00;

    @Override
    public void imprimirValor() {
        double valorFinal;
        valorFinal = getIngresso() + this.valorAdicionalVIP;
        System.out.println(valorFinal);
    }
    
    public double getValorAdicionalVIP(){
    return valorAdicionalVIP;
    }
    
    
}
