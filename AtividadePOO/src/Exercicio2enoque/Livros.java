package Exercicio2enoque;
public class Livros extends produtos{
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    @Override
    public String toString(){
        System.out.println(super.getNome());
        System.out.println(super.getPreco());
        System.out.println(this.getAutor());
        return null;
       
    
    }
    

}
