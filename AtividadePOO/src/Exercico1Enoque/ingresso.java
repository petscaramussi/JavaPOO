package Exercico1Enoque;
public abstract class ingresso {
    private double Ingresso = 10.00;

    public double getIngresso() {
        return Ingresso;
    }

    public void setIngresso(double Ingresso) {
        this.Ingresso = Ingresso;
    }

 
    public abstract void imprimirValor();
}
