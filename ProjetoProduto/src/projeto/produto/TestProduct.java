package projeto.produto;
import java.util.ArrayList;

/**
 *
 * @author felipe.fmandelli
 * Date: 02/03/2022
 */
public class TestProduct {

    public static void main(String[] args) {
        // Gera Um Arraylist para Armazenar os Objetos
        ArrayList<Produto> produtos = new ArrayList();
        
        // Adiciona Objetos ao Array
        produtos.add (new Produto("Monitor", 2000));
        produtos.add (new Produto("Teclado", 500));
        produtos.add (new Produto("Mouse", 200));
        
        // Loop Percorrendo o Array e Apresentando os Atributos dos Objetos  
        for(Produto p: produtos){
            System.out.println("Nome do produto:\t" + p.getName());
            System.out.println("Status do produto:\t" + p.getStatus());
            System.out.println("Preco do produto:\t" + p.getPrice() + " Reais");
            System.out.println();
        }     
     
        
    }
    
}
