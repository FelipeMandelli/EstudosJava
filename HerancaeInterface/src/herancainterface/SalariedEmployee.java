package herancainterface;

/**
 *
 * @author FelipeMandelli
 * Date: 17/04/2022
 */
public class SalariedEmployee extends Employee {
    private double salarioSemanal;
    
    public SalariedEmployee(String primeiroNome, String sobrenome, String seguroSocial, double salarioSemanal){
        
        super(primeiroNome, sobrenome, seguroSocial);
        
        if (salarioSemanal <= 0){
            throw new IllegalArgumentException("Salario Semanal deve ser maior que 0");
        }
        
        this.salarioSemanal = salarioSemanal;
    }
    
    public double getSalarioSemanal() {return salarioSemanal;}
    
    @Override
    public double ganhos() {return getSalarioSemanal();}
    
    @Override
    public String toString(){
        return String.format("Assalariado: %s%n%s: $%,.2f", super.toString(), "Salario Semanal", getSalarioSemanal());
    }
}
