package clientinheritance;

/**
 *
 * @author Felipe.fmandelli
 */
public class Cliente {
    
    private final String nomeCliente;
    private final int idCliente;
    private final String dataConta;
    
    public Cliente(String nomeCliente, int idCliente, String dataConta){
        this.nomeCliente = nomeCliente;
        this.idCliente = idCliente;
        this.dataConta = dataConta;
    }
    
    public String getNomeCliente() {return nomeCliente;}
    
    public int getIdCliente() {return idCliente;}
    
    public String getDataConta() {return dataConta;}
    
        
    
    
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %d%n%s: %s", "Cliente", getNomeCliente(),"ID",getIdCliente(),"Conta Criada em", getDataConta());
    }
}
