
package Exercicio1;

public class Assistente extends Funcionario {
    private int NumeroMatricula;

    public int getNumeroMatricula() {
        return NumeroMatricula;
    }

    public void setNumeroMatricula(int NumeroMatricula) {
        this.NumeroMatricula = NumeroMatricula;
    }
    
    public void ExibirDados(){
        System.out.println(getNumeroMatricula() +"Numero da matricula:");
    
    }

    
    
}
