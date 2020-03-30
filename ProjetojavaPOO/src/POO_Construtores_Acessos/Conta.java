package POO_Construtores_Acessos;

public class Conta {
       
    private int numero;
    private double saldo;
    private double limite;
    private String nome;

    //construtor

    public Conta(double s){
        this.setSaldo(s);
    }
    
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }



    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void Sacar(double saque){
        this.saldo = this.saldo - saque;
        System.out.println("saldo restante: " + saldo);
        
    }
    public void depositar(double deposito){
        this.saldo = deposito + this.saldo;
        System.out.println("saldo total: " + saldo);
    }

    
}
