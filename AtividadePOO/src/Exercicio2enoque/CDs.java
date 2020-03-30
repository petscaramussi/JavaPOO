package Exercicio2enoque;
public class CDs extends produtos{

  private int numeroFaixas;

    public int getNumeroFaixas() {
        return numeroFaixas;
    }

    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }
    

    @Override
    public String toString(){
        System.out.println(super.getNome());
        System.out.println(super.getPreco());
        System.out.println(this.getNumeroFaixas());
        return null;
    
    }
}
