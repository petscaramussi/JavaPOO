package Exercico1Enoque;
public abstract class VIP extends ingresso{
    private double adicionalVIP = 5.00;
    private double VIP;
    
    public abstract void imprimirLocalização();
    
    @Override
    public abstract void imprimirValor();
   


    public double getVIP(){
    VIP = this.adicionalVIP + super.getIngresso();
    return VIP;
    }
    
}
