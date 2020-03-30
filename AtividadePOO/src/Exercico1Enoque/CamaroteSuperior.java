package Exercico1Enoque;
public class CamaroteSuperior extends VIP{
    private double AdicionalCamaroteSup = 5.00;
    private String localização = "Avenida das Nações Unidas, 17955, São Paulo‎";

    public double getValorAdicionalCamaroteSup() {
        return AdicionalCamaroteSup;
    }

    public void setValorAdicionalCamaroteSup(double valorAdicionalCamaroteSup) {
        this.AdicionalCamaroteSup = valorAdicionalCamaroteSup;
    }
    
    @Override
    public void imprimirValor(){
        System.out.println(this.AdicionalCamaroteSup + super.getVIP());
    }

    @Override
    public void imprimirLocalização() {
        System.out.println(this.localização);
    }
    
    
}
