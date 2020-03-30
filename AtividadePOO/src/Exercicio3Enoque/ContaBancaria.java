package Exercicio3Enoque;

public class ContaBancaria {
    private String nome; 
    private int numero; 
    private double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    public void sacar(){
    if(saldo < 0){
            System.out.println("Não é permitido saldo negativo");
        }
    }
    
    
    public void depositar(double saldo){
        
    }
     
    
}
