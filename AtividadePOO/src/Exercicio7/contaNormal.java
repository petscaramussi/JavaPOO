package Exercicio7;
public class contaNormal {

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    private double saldo;
    private double taxaOPNormal = 0.05;
    
    public void sacar(double saque){
        taxaOPNormal = saque * taxaOPNormal;
        saldo = saldo - taxaOPNormal; 
        saldo = saldo - saque;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double deposito){
        saldo = saldo + deposito;
    }
    
    public void mostrarSaldo(){
        System.out.println("Saldo: " + saldo);
    }
}
