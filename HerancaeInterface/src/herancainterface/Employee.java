package herancainterface;

/**
 *
 * @author FelipeMandelli
 * Date: 17/04/2022
 */
public abstract class Employee implements Pagavel{
    private final String primeiroNome;
    private final String sobrenome;
    private final String seguroSocial;
    
    public Employee(String primeiroNome, String sobrenome, String seguroSocial){
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.seguroSocial = seguroSocial;
    }
    
    public String getPrimeironome() {return primeiroNome;}
    
    public String getSobrenome() {return sobrenome;}
    
    public String getSeguroSocial() {return seguroSocial;}
    
    @Override
    public String toString(){
        return String.format("%s %s%nSeguro Social: %s", getPrimeironome(), getSobrenome(), getSeguroSocial());
    }
    
    public abstract double ganhos();
    
    public double getQuantiaPagar() {return ganhos();}
}
