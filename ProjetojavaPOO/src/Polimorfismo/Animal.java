package Polimorfismo;
public abstract class Animal {
    
    //atributos
    private String especie;
    private double tamanho;
    private double peso;
    
    public void locomover(){
        System.out.println("Correndo");
    }
    
    public void emitirSom(){
        System.out.println("Latindo");
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
