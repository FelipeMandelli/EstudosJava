package herancas;

/**
 *
 * @author FelipeMandelli
 * Date: 09/03/2022
 */
public class ComissaoFuncionario extends Object {   // Se n for indicado, a classe sera subclasse de Object por definicao
    // Declarando Atributos Referentes a funcionario com comissao
    private final String primeiroNome;
    private final String sobrenome;
    private final String seguroSocial;
    private final double vendaBruta;
    private final double comissaoTaxa;
    
    // Constructor da Classe com 5 Atributos
    public ComissaoFuncionario(String primeiroNome, String sobrenome, String seguroSocial, double vendaBruta, double comissaoTaxa){
        
        // Devolve Erros caso o Valor seja Incompativel        
        if(vendaBruta < 0.0){
            throw new IllegalArgumentException("Venda Bruta deve ser acima de 0,0");
        }
        
        if (comissaoTaxa <= 0.0 || comissaoTaxa >= 1.0){
            throw new IllegalArgumentException("A Comissao deve estar entre 0,0 e 1,0");
        }
        
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.seguroSocial = seguroSocial;
        this.vendaBruta = vendaBruta;
        this.comissaoTaxa = comissaoTaxa;
    }
    
    // Metodos da Classe (getters)
    public String getPrimeiroNome() { return primeiroNome; }
    
    public String getSobrenome() { return sobrenome; }
    
    public String getSeguroSocial() { return seguroSocial; }
    
    public double getVendaBruta() { return vendaBruta; }
    
    public double getComissaoTaxa() { return comissaoTaxa; }
    
    // Metodo Calcula Ganhos
    public double ganhos() { return getComissaoTaxa() * getVendaBruta(); } 
    /**
     * Utilizando os Getters e nao os proprios atributos, possibilita a chamada da funcao "ganhos", que e publica
     * sem que haja a necessidade de alterar o grau de acesso dos Atributos. Mesmo caso na Funcao "toString" abaixo
     */
    
    // Retorna Representacao em String dos Dados
    @Override   // Indica que o Metodo esta reescrevendo um metodo da Superclasse (no caso de Object)
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "Funcionario Comissionado", getPrimeiroNome(), getSobrenome(), "Seguro Social", getSeguroSocial(), "Venda Bruta", getVendaBruta(), "Taxa de Comissao", getComissaoTaxa(), "Ganhos", ganhos());
    }
}
