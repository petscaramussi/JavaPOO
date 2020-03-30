package Exercicio4;

public class Novo extends Imovel {
    private double adicional = 100;

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public void imprimir() {
       double valorFinal;
       valorFinal = getPreco() + this.getAdicional();
        System.out.println(valorFinal) ;
    }
    
    

    
    
    
    
    
}
