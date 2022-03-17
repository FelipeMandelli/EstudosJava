package clientinheritance;

/**
 *
 * @author Felipe.fmandelli
 */
public class JuridicoCliente extends Cliente{
    private String cnpj;
    private String nomeFantasia;
    private float rendaAnual;
    
    public JuridicoCliente(String nomeCliente, int idCliente, String dataConta, String cnpj, String nomeFantasia, float rendaAnual){
        super(nomeCliente, idCliente, dataConta);
        
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.rendaAnual = rendaAnual;
    }
    
    public String getCnpj() {return cnpj;}   
    
    public String getNomeFantasia() {return nomeFantasia;}
    
    public float getRendaAnual() {return rendaAnual;}
    
    
    
    @Override
    public String toString(){
        return String.format("%s%s%n%s%s%s%s%n%s: %.2f", "Juridico_", super.toString(),"Nome Fantasia: ", getNomeFantasia(),"\tCNPJ: ", getCnpj(), "Renda do Negocio", getRendaAnual());
    }
}
