package Exercicio8;
public class Fatura {
    //construtor com as variaveis de instancia
    public Fatura(String numeroC,String descriçãoC,int quantidadeC,double preçoC){
        this.numero = numeroC;
        this.descrição = descriçãoC;
        this.quantidade = quantidadeC;
        this.preço = preçoC;
    }
    private String numero;
    private String descrição;
    private int quantidade;
    private double preço;
    private double valorFatura;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
    
    
    
    public double getValorFatura(){
       valorFatura = quantidade * preço;
       //condição para caso o preço seja negativo
       if(preço < 0){
       preço = 0.00;
       }
       //condição para caso o valor da fatura seja negativo
       if(valorFatura < 0){
       valorFatura = 0;
       }
       return valorFatura;
    }
    
    
}
