/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package test.product;
import java.util.ArrayList;

/**
 *
 * @author felipe.fmandelli
 */
public class TestProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList();
        
        produtos.add (new Produto("Monitor", 2000));
        produtos.add (new Produto("Teclado", 500));
        produtos.add (new Produto("Mouse", 200));
        
                
        for(Produto p: produtos){
            System.out.println("Nome do produto:\t" + p.getName());
            System.out.println("Status do produto:\t" + p.getStatus());
            System.out.println("Preco do produto:\t" + p.getPrice() + " Reais");
            System.out.println();
        }     
     
        
    }
    
}
