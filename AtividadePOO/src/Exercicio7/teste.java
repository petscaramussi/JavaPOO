package Exercicio7;
public class teste {
    public static void main(String[] args) {
        contaNormal cn = new contaNormal();
        contaEspecial ce = new contaEspecial();
        
        //operação com a conta especial
        ce.depositar(400);
        ce.sacar(200);
        ce.mostrarSaldo();
        
        //operação com a conta normal
        cn.depositar(400);
        cn.sacar(200);
        cn.mostrarSaldo();
        
        
    }
}
