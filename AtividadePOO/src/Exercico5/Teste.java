package Exercico5;
public class Teste {
public static void main(String[] args) {
    
    //assistente administrativo
    AssistenteAdministrativo AD = new AssistenteAdministrativo();
    AD.setMatricula(6789);
    AD.setNome("Julão");
    AD.mostrarMatricula();
    AD.mostrarNome();
    
    //assistente tecnico
    AssistenteTecnico AT = new AssistenteTecnico();
    AT.setMatricula(8900);
    AT.setNome("Matheus");
    AT.mostrarMatricula();
    AT.mostrarNome();
    
    //cachorro e gato
    Cachorro c = new Cachorro();
    Gato g = new Gato();
    
    c.latir();
    c.caminhar();
    
    g.miar();
    g.caminhar();
    
    
    
}
    
}
