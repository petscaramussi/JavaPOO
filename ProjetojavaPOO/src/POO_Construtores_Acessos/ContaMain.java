package POO_Construtores_Acessos;
public class ContaMain {
    public static void main(String[] args) {
        
        
        Conta c = new Conta(10000.0);
        c.setNumero(1);
        System.out.println("Numero da conta: " + c.getNumero());
        c.setNome("Jõao");
        System.out.println("Nome: " + c.getNome());
        c.setLimite(4000.00);
        System.out.println("Limite: " + c.getLimite());
        
        
        c.Sacar(200.00);
        c.depositar(2000.50);
        
        
        
        
        
        
        
        
    }
}
