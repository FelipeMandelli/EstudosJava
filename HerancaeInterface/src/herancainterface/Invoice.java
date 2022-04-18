package herancainterface;

/**
 *
 * @author FelipeMandelli
 * Date: 17/04/2022
 */
public class Invoice implements Pagavel{
    private final String numeroPeca;
    private final String descricaoPeca;
    private final int quantidade;
    private final double precoPeca;
    
    public Invoice(String numeroPeca, String descricaoPeca, int quantidade, double precoPeca){
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que 0");
        }
        
        if (precoPeca <= 0.0){
            throw new IllegalArgumentException("Preco por item deve ser maior que 0");
        }
        
        this.numeroPeca = numeroPeca;
        this.descricaoPeca = descricaoPeca;
        this.quantidade = quantidade;
        this.precoPeca = precoPeca;
    }
    
    public String getNumeroPeca() { return numeroPeca;}
    
    public String getDescricaPeca() {return descricaoPeca;}
    
    public int getQuantidade() { return quantidade;}
    
    public double getPrecoPeca() { return precoPeca;}
    
    @Override
    public String toString(){
        return String.format("Fatura: %nID da Peca: %s (%s) %nQuantidade: %d %nPreco por Item: $%,.2f", getNumeroPeca(), getDescricaPeca(), getQuantidade(), getPrecoPeca());
    }
    
    @Override
    public double getQuantiaPagar(){
        return getQuantidade() * getPrecoPeca();
    }
}
