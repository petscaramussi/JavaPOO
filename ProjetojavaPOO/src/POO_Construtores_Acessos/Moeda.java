package POO_Construtores_Acessos;

public class Moeda {
    private double valor;
    private String nome;
    
    //construtor vasio
    public Moeda(){}
    //construtor com parametros
    public Moeda(double valor, String nome){
        this.setValor(valor);
        this.setNome(nome);
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void mostrar(){
        System.out.println(getValor());
        System.out.println(getNome());
    }

    
    
}
