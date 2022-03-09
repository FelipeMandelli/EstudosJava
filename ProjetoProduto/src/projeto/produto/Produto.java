
package projeto.produto;

/**
 *
 * @author felipe.fmandelli
 * Date: 02/03/2022
 */
public class Produto {
    
    // Declarando os Atributos de "Produto"
    private String nameProduct; //Nome do Produto
    private boolean statusDisponibilidade;  //Disponibilidade em Estoque
    private float priceProduct; //Preco
    
    // Constructor Inicializa Produto com Atributos Iniciais: Nome, Disponibilidade e Preco
    public Produto(String name, float price){
        
        this.nameProduct = name;
        this.priceProduct = price;
        this.statusDisponibilidade = true;
    }
    
    // Criando Metodos para "Produto" (get e set)
    public String getName(){ // Retorna o nome do Produto
        return nameProduct;
    }
    
    public boolean getStatus(){ // Retorna a Disponibilidade
        return statusDisponibilidade;
    }
    
    public float getPrice(){ // Retorna o Preco
        return priceProduct;
    }
    
    public void setStatus(boolean newStatus){ // Altera Disponibilidade do produto 
        statusDisponibilidade = newStatus;
    }
    
    public void setPrice(float newPrice){ // Altera Preco do Produto
        priceProduct = newPrice;
    }
}
