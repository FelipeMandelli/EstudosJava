/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ado1;

import java.io.*;

/**
 *
 * @author Desktop
 */
public class PIBregioes {

    public static void main(String[] args) {
        
        String arquivoPIB = "Pib.txt";
        
        String linha = null;
        
        String estados[] = null;
        float valores[] = null;
        
        try {
            FileReader leitor = new FileReader(arquivoPIB);
            
            BufferedReader leitorBuffer = new BufferedReader(leitor);
            
            int i = 0;
            
            while((linha = leitorBuffer.readLine()) != null) {
                estados[i] = ;
                valores[i] = ;
                i++;
            }
            
            leitorBuffer.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Arquivo inexistente: '" + arquivoPIB + "'");
        }
        catch(IOException ex){
            System.out.println("Erro lendo o arquivo '" + arquivoPIB + "'");
        }
        
    }
    
}
