package herancainterface;

/**
 *
 * @author FelipeMandelli
 * Date: 17/04/2022
 */
public class BasePlusComissionEmployee extends CommissionEmployee{
    private double salarioBase;
    
    public BasePlusComissionEmployee(String primeiroNome, String sobrenome, String seguroSocial, double vendaBruta, double taxaComissao, double salarioBase){
        
        super(primeiroNome, sobrenome, seguroSocial, vendaBruta, taxaComissao);
        
        if (salarioBase <= 0.0){
            throw new IllegalArgumentException("Salario Base deve ser maior que 0");
        }
        
        this.salarioBase = salarioBase;
    }
    
    
    public double getSalarioBase() { return salarioBase;}
    
    @Override
    public double ganhos() { return getSalarioBase() + super.ganhos();}
    
    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f", "Base +", super.toString(), "Salario Base", getSalarioBase());
    }
}
