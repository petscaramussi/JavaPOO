package Exercicio4;

public class Velho extends Imovel {
    private double desconto = 300;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public void imprimir() {
        double valorFinal;
        valorFinal = getPreco() + this.getDesconto();
        System.out.println(valorFinal) ;
        
        
    }
    
    
    
   
    
    
    
    
    
    
    
    
    
}
