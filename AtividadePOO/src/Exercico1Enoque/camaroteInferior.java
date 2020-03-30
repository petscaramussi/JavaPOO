package Exercico1Enoque;
public class camaroteInferior extends VIP{
    private String localização = "Avenida das Nações Unidas, 17955, São Paulo‎";

    public String getLocalização() {
        return localização;
    }

    public void setLocalização(String localização) {
        this.localização = localização;
    }
    
 
    
    @Override
    public void imprimirLocalização(){
        System.out.println(localização);
    }
   
    @Override
    public void imprimirValor() {
        System.out.println(super.getVIP());
    }
    
}
