package PacoteJavaPOO;

public class CriarCaneta {
    public static void main(String[] args) {
        //instanciando o objeto Caneta
        Caneta caneta = new Caneta();
        caneta.setPonta(0.5);
        caneta.setCarga(10);
        
        caneta.modelo = "BIC";
        caneta.cor = "azul ciano com tons suaves de groselha";
        caneta.tampada = false;
        System.out.println("mostrar carga " + caneta.getCarga());
        // mostrar tudo que foi definido a respeito da caneta 
        caneta.mostrar();
        
        
    }
    
}
