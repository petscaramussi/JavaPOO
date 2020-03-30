package Exercico;
public abstract class Ingresso {

    private double valor;
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public abstract void MostrarValor();
    
    
}
