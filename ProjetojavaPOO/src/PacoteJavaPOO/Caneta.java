package PacoteJavaPOO;

public class Caneta {
    //atributos do objeto
   public String modelo;
   public String cor;
   private double ponta;
   private int carga;
   protected boolean tampada;

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    // mmétodos do objeto
   public void escrever(){
       
    }
    
   public void rabiscar(){
        
    }
    
   public void pintar(){
        
    }
    
   public void tampar(){
        System.out.println("Caneta tampada");
    }
    
   public void destampar(){
         System.out.println("Caneta destampada");
    }
    
   public void mostrar(){
        System.out.println("Modelo é " +this.modelo);
        System.out.println("Está tampada: "+this.tampada);
        
        status();
        System.out.println("mostra ponta: "+getPonta());
        
    }
   public void status(){
        if(this.tampada == true){
            tampar();
        }else{
            destampar();
        }
    }
    
    
    
}
