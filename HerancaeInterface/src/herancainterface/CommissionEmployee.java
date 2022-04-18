package herancainterface;

/**
 *
 * @author FelipeMandelli
 * Date: 17/04/2022
 */
public class CommissionEmployee extends Employee{
    private double vendaBruta;
    private double taxaComissao;
    
    //Constructor de Empregado Comissionado
    public CommissionEmployee(String primeiroNome, String sobrenome, String seguroSocial, double vendaBruta, double taxaComissao){
        super(primeiroNome, sobrenome, seguroSocial);
        
        if (vendaBruta < 0.0){
            throw new IllegalArgumentException("Venda Bruta deve ser maior que 0");
        }
        
        if (taxaComissao <= 0.0 || taxaComissao >= 1){
            throw new IllegalArgumentException("Taxa de Comissao deve estar entre 0 e 1");
        }
        
        this.vendaBruta = vendaBruta;
        this.taxaComissao = taxaComissao;
    }
    
    //Metodos get de Empregado Comissionado    
    public double getVendaBruta() {return vendaBruta;}
    
    public double getTaxaComissao() {return taxaComissao;}
    
    
    //Metodos de Empregado Comissionado
    @Override
    public double ganhos() { return (getTaxaComissao() * getVendaBruta());}
    
    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", "Comissão", super.toString(), "Venda Bruta", getVendaBruta(), "Taxa de Comissao", getTaxaComissao());
    }
}
