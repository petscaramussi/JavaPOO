package Exercicio7;
public class contaEspecial extends contaNormal{
        private double taxaOPEspecial = 0.01;
        private double saldoFinal;
        
        @Override
        public void sacar(double saque){
        double aux;
        taxaOPEspecial = saque * taxaOPEspecial;
        aux = (super.getSaldo() - taxaOPEspecial) - saque; 
        super.setSaldo(aux);
        
             
    }
    
}
