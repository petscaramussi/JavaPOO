package POO_Construtores_Acessos;
public class Usuario {
    //atributos
    private String RLogin;
    private String RSenha;
    private String LLogin;
    private String LSenha;
    

    public String getRLogin() {
        return RLogin;
    }

    public void setRLogin(String RLogin) {
        this.RLogin = RLogin;
    }

    public String getRSenha() {
        return RSenha;
    }

    public void setRSenha(String RSenha) {
        this.RSenha = RSenha;
    }

    public String getLLogin() {
        return LLogin;
    }

    public void setLLogin(String LLogin) {
        this.LLogin = LLogin;
    }

    public String getLSenha() {
        return LSenha;
    }

    public void setLSenha(String LSenha) {
        this.LSenha = LSenha;
    }
    
    public void condição(){
        
    if(this.getRLogin() == this.getLLogin() && this.getLSenha() == this.getRSenha()){
    
        System.out.println("Logado com sucesso!");
    }else{
        System.out.println("deu cento nn...");
    }
    }
    
    public void mostrar(){
        System.out.println("Registro:");
        System.out.println(this.getRLogin());
        System.out.println(this.getRSenha());
        System.out.println("Login:");
        System.out.println(this.getLLogin());
        System.out.println(this.getLSenha());
    }
    
          
          
          
}

      
        

