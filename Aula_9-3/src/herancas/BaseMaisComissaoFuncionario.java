package herancas;

/**
 *
 * @author FelipeMandelli
 * Date: 09/03/2022
 */
public class BaseMaisComissaoFuncionario extends ComissaoFuncionario {
    // Declarando Atributo Referente a Funcionario com Base+Comissao
    private double salarioBase;
    
    // Constructor da Classe com 6 Atributos
    public BaseMaisComissaoFuncionario(String primeiroNome, String sobrenome, String seguroSocial, double vendaBruta, double comissaoTaxa, double salarioBase){
        
        // Utiliza o Construtor Existente na Superclasse para Iniciar Atributos em Comum
        super(primeiroNome,sobrenome, seguroSocial, vendaBruta, comissaoTaxa);
        
        if(salarioBase <= 0.0){
            throw new IllegalArgumentException("Salario Base deve ser Maior que 0");
        }
        
        this.salarioBase = salarioBase;
    }
    
    public double getSalarioBase() { return salarioBase; }
    
    
    @Override
    public double ganhos() { return getSalarioBase() + super.ganhos(); }
    
    @Override
    public String toString(){
        return String.format("%s%s%n%s: %.2f%n", "Fixo-", super.toString(), "Salario Base", getSalarioBase());
    }
}
