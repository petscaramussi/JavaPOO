package Exercico5;
public class AssistenteAdministrativo {
    private int matricula;
    private String nome;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void mostrarMatricula(){
        System.out.println("Matricula: " + this.getMatricula());
    }
    
    public void mostrarNome(){
        System.out.println("Nome: " + this.getNome());
    }
}
