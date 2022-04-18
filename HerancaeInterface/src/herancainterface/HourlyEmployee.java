package herancainterface;

/**
 *
 * @author FelipeMandelli
 * Date: 17/04/2022
 */
public class HourlyEmployee extends Employee {
    private double remuneracao;
    private double horas;
    
    public HourlyEmployee(String primeiroNome, String sobrenome, String seguroSocial, double remuneracao, double horas){
        super(primeiroNome, sobrenome, seguroSocial);
        
        if (remuneracao <= 0.0){
            throw new IllegalArgumentException("Remuneracao por Hora deve ser maior que 0");
        }
        
        if ((horas <= 0.0) || (horas > 168.0)){
            throw new IllegalArgumentException("Carga Horaria deve ser maior que 0 e menor que 168");
        }
        
        this.remuneracao = remuneracao;
        this.horas = horas;
    }
    
    public double getRemuneracao() {return remuneracao;}
    
    public double getHoras() {return horas;}
    
    @Override
    public double ganhos(){
        if (getHoras() < 40){
            return getRemuneracao() * getHoras();
        }
        else {
            return (40 * getRemuneracao() + (getHoras() - 40) * getRemuneracao() * 1.5);
        }
    }
    
    @Override
    public String toString(){
        return String.format("Por Horas: %s%n%s: $%,.2f; %s: %,.2f", super.toString(), "Remuneracao por Hora", getRemuneracao(), "Horas Trabalhadas", getHoras());
    }
}
