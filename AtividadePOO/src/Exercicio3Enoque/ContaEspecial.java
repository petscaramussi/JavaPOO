package Exercicio3Enoque;

public class ContaEspecial extends ContaBancaria {
    private double limite;
    
    @Override
    public void sacar(){ 
        if(super.getSaldo() < 0 && super.getSaldo() == limite){
            
    }
    }
    
}
