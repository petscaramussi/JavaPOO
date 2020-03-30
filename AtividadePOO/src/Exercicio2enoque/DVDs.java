package Exercicio2enoque;
public class DVDs extends produtos {
    private double duracao;

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    
    @Override
    public String toString(){
        System.out.println(super.getClass());
        System.out.println(super.getPreco());
        System.out.println(this.getDuracao());
        return null;
    }
}
