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
