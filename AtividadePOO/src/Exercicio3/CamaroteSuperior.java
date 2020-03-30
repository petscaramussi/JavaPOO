package Exercicio3;
public class CamaroteSuperior extends VIP{
    
    private double valorAdicionalCamaroteInferior = 5.00;

    @Override
    public void imprimirValor() {
        double valorFinal;
        valorFinal = getValorAdicionalVIP() + valorAdicionalCamaroteInferior;
        System.out.println(valorFinal);
    }

    public double getValorAdicionalCamaroteInferior() {
        return valorAdicionalCamaroteInferior;
    }
    
}
