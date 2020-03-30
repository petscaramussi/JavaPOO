
package Exercicio1;
public class AssitenteAdministrativo extends Assistente{
    
   private double bonusNoturno;
   private double salarioFinal;
    
    public void TurnoDeTrabalho(String Turno){
        if("manhã".equals(Turno)){
            System.out.println(this.getSalario());
        }else{
            
            salarioFinal = this.getSalario() + bonusNoturno;
        }

        
    }
   @Override
        public void ExibirDados(){
        System.out.println(this.getNumeroMatricula());    
        System.out.println(salarioFinal);
        }
}
