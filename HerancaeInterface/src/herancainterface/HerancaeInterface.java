package herancainterface;

/**
 *
 * @author FelipeMandelli
 * Date: 17/04/2022
 */
public class HerancaeInterface {


    public static void main(String[] args) {
        
        Pagavel[] objetosPagaveis = new Pagavel[]{
            new Invoice("01234", "Pneu", 2, 375.00),
            new SalariedEmployee("Rafael", "Mandelli", "111-11-111", 1500.00),            
            new BasePlusComissionEmployee("Fatima", "Fernandes", "159-99-951", 5000, 0.5, 500),
            new CommissionEmployee("Claudio", "Junior", "357-77-753", 5000, 0.6),
            new HourlyEmployee("Gabriela", "Monteiro", "456-66-654", 50, 45),
        };
        
        System.out.println("Invoices and Employees processed polymorphically:");
        
        for (Pagavel pagavelAtual : objetosPagaveis){
            System.out.printf("%n%s %nA Pagar: $%,.2f%n", pagavelAtual.toString(), pagavelAtual.getQuantiaPagar());
        }
    }

}
