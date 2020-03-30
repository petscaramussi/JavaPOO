
package Exercicio1;
public class AssitenteTecinico extends Assistente{
    
    private double BonusSalarial = 500.00;
    
    
    @Override
    public void ExibirDados() {
        double SalarioFinal = super.getSalario() + BonusSalarial;
        System.out.println(SalarioFinal);
    }

    public double getBonusSalarial() {
        return BonusSalarial;
    }

    public void setBonusSalarial(double BonusSalarial) {
        this.BonusSalarial = BonusSalarial;
    }

    
}
